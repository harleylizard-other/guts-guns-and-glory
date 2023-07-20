package com.chaottic.ggg.common.item;

import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;

public final class BulletItem extends Item {
    private final ResourceKey<BulletType> type;

    public BulletItem(ResourceKey<BulletType> type, Properties properties) {
        super(properties);
        this.type = type;
    }
}
