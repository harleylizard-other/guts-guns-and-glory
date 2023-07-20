package com.chaottic.ggg.common.block;

import com.chaottic.ggg.common.GutsGunsAndGloryBlockEntityTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;

public final class MunitionsBoxBlock extends Block implements EntityBlock {
    public MunitionsBoxBlock(Properties properties) {
        super(properties);
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos blockPos, BlockState blockState) {
        return GutsGunsAndGloryBlockEntityTypes.MUNITIONS_BOX.create(blockPos, blockState);
    }
}
