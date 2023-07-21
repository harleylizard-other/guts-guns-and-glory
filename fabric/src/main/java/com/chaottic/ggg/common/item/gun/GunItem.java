package com.chaottic.ggg.common.item.gun;

import mod.azure.azurelib.animatable.GeoItem;
import mod.azure.azurelib.core.animatable.instance.AnimatableInstanceCache;
import mod.azure.azurelib.core.animation.AnimatableManager;
import mod.azure.azurelib.util.AzureLibUtil;
import net.minecraft.world.item.Item;

import java.util.function.Supplier;

public sealed abstract class GunItem extends Item implements GeoItem permits SnubNoseItem {
    private final AnimatableInstanceCache cache = AzureLibUtil.createInstanceCache(this);
    private final Supplier<Object> supplier = GeoItem.makeRenderer(this);

    public GunItem(Properties properties) {
        super(properties);
    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllers) {
    }

    @Override
    public Supplier<Object> getRenderProvider() {
        return supplier;
    }

    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return cache;
    }
}
