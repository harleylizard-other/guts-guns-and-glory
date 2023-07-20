package com.chaottic.ggg.common.block.entity;

import com.chaottic.ggg.common.GutsGunsAndGloryBlockEntityTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public final class MunitionsBoxBlockEntity extends BlockEntity {
    public MunitionsBoxBlockEntity(BlockPos blockPos, BlockState blockState) {
        super(GutsGunsAndGloryBlockEntityTypes.MUNITIONS_BOX, blockPos, blockState);
    }
}
