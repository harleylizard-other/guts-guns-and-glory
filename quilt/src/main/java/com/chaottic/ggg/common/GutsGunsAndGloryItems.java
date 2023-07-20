package com.chaottic.ggg.common;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Item;

public final class GutsGunsAndGloryItems {

    private GutsGunsAndGloryItems() {}

    public static void registerAll() {

    }

    private void register(String name, Item item) {
        Registry.register(BuiltInRegistries.ITEM, GutsGunsAndGlory.resourceLocation(name), item);
    }
}
