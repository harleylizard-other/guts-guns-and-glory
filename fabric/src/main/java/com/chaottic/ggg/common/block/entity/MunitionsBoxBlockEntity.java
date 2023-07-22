package com.chaottic.ggg.common.block.entity;

import com.chaottic.ggg.common.GutsGunsAndGloryBlockEntityTypes;
import com.chaottic.ggg.common.GutsGunsAndGloryBlocks;
import com.chaottic.ggg.common.block.MunitionsBoxBlock;
import mod.azure.azurelib.animatable.GeoBlockEntity;
import mod.azure.azurelib.core.animatable.instance.AnimatableInstanceCache;
import mod.azure.azurelib.core.animation.AnimatableManager;
import mod.azure.azurelib.util.AzureLibUtil;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public final class MunitionsBoxBlockEntity extends BlockEntity implements GeoBlockEntity {
    private final AnimatableInstanceCache cache = AzureLibUtil.createInstanceCache(this);

    public MunitionsBoxBlockEntity(BlockPos blockPos, BlockState blockState) {
        super(GutsGunsAndGloryBlockEntityTypes.MUNITIONS_BOX, blockPos, blockState);
    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllers) {
    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return cache;
    }
}
