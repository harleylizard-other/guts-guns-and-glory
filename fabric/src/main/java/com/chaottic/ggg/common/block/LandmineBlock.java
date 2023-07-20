package com.chaottic.ggg.common.block;

import com.chaottic.ggg.common.GutsGunsAndGloryItems;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public final class LandmineBlock extends Block {
    private static final BooleanProperty EMBEDDED = BooleanProperty.create("embedded");

    private static final VoxelShape SHAPE = Shapes.join(box(4, 0, 4, 12, 2, 12), box(7, 2, 7, 9, 3, 9), BooleanOp.OR);
    private static final VoxelShape SHAPE_EMBEDDED = box(7, 0, 7, 9, 1, 9);

    public LandmineBlock(Properties properties) {
        super(properties);
        registerDefaultState(getStateDefinition().any().setValue(EMBEDDED, false));
    }

    @Override
    public InteractionResult use(BlockState blockState, Level level, BlockPos blockPos, Player player, InteractionHand interactionHand, BlockHitResult blockHitResult) {
        var itemStack = player.getItemInHand(interactionHand);
        if (itemStack.is(GutsGunsAndGloryItems.CROWBAR)) {
            var embedded = !isEmbedded(blockState);
            level.playLocalSound(blockPos, embedded ? SoundEvents.STONE_BUTTON_CLICK_ON : SoundEvents.STONE_BUTTON_CLICK_OFF, SoundSource.BLOCKS, 1.0F, 1.0F, true);

            if (!level.isClientSide) {
                level.setBlock(blockPos, defaultBlockState().setValue(EMBEDDED, embedded), Block.UPDATE_ALL);
                itemStack.hurtAndBreak(1, player, entity -> entity.broadcastBreakEvent(interactionHand));
                return InteractionResult.SUCCESS;
            }
            return InteractionResult.CONSUME;
        }
        return InteractionResult.PASS;
    }

    @Override
    public void entityInside(BlockState blockState, Level level, BlockPos blockPos, Entity entity) {
        if (isEmbedded(blockState)) {
            // Keep destruction to C4.
            level.explode(null, blockPos.getX() + 0.5F, blockPos.getY(), blockPos.getZ() + 0.5F, 5.0F, Level.ExplosionInteraction.NONE);
            level.removeBlock(blockPos, false);
        }
    }

    @Override
    public boolean canSurvive(BlockState blockState, LevelReader levelReader, BlockPos blockPos) {
        var below = blockPos.below();
        return levelReader.getBlockState(below).isFaceSturdy(levelReader, below, Direction.UP);
    }

    @Override
    public BlockState updateShape(BlockState blockState, Direction direction, BlockState blockState2, LevelAccessor levelAccessor, BlockPos blockPos, BlockPos blockPos2) {
        return canSurvive(blockState, levelAccessor, blockPos) ? blockState : Blocks.AIR.defaultBlockState();
    }

    @Override
    public VoxelShape getShape(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos, CollisionContext collisionContext) {
        return isEmbedded(blockState) ? SHAPE_EMBEDDED : SHAPE;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(EMBEDDED);
    }

    private boolean isEmbedded(BlockState blockState) {
        return blockState.getValue(EMBEDDED);
    }
}
