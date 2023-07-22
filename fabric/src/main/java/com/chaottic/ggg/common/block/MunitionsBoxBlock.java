package com.chaottic.ggg.common.block;

import com.chaottic.ggg.common.GutsGunsAndGloryBlockEntityTypes;
import com.chaottic.ggg.common.Util;
import com.mojang.math.Axis;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;

import java.util.HashMap;
import java.util.Map;

public final class MunitionsBoxBlock extends HorizontalDirectionalBlock implements EntityBlock {
    private static final Map<Direction, VoxelShape> DIRECTION_TO_SHAPE = new HashMap<>(4);

    private static final VoxelShape SHAPE = box(0.009999999999999787, 0.01, 3.51, 15.99, 11.99, 12.49);

    public MunitionsBoxBlock(Properties properties) {
        super(properties);
        registerDefaultState(defaultBlockState().setValue(FACING, Direction.NORTH));
    }

    @Override
    public VoxelShape getShape(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos, CollisionContext collisionContext) {
        return DIRECTION_TO_SHAPE.computeIfAbsent(blockState.getValue(FACING), direction -> Util.rotate(SHAPE, Axis.YP.rotationDegrees(direction.toYRot())));
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos blockPos, BlockState blockState) {
        return GutsGunsAndGloryBlockEntityTypes.MUNITIONS_BOX.create(blockPos, blockState);
    }

    @Override
    public RenderShape getRenderShape(BlockState blockState) {
        return RenderShape.ENTITYBLOCK_ANIMATED;
    }
}
