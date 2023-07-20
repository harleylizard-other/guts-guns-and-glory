package com.chaottic.ggg.common.block;

import com.chaottic.ggg.common.GutsGunsAndGloryItems;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
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
            if (!level.isClientSide) {
                level.setBlock(blockPos, defaultBlockState().setValue(EMBEDDED, !isEmbedded(blockState)), Block.UPDATE_ALL);
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
