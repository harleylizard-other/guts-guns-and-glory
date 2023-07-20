package com.chaottic.ggg.common;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;

public final class GutsGunsAndGloryItems {
    public static final Item BARBED_WIRE = new BlockItem(GutsGunsAndGloryBlocks.BARBED_WIRE, new Item.Properties());
    public static final Item LANDMINE = new BlockItem(GutsGunsAndGloryBlocks.LANDMINE, new Item.Properties());

    private GutsGunsAndGloryItems() {}

    public static void registerAll() {
        register("barbed_wire", BARBED_WIRE);
        register("landmine", LANDMINE);
    }

    private static void register(String name, Item item) {
        Registry.register(BuiltInRegistries.ITEM, GutsGunsAndGlory.resourceLocation(name), item);
    }
}
