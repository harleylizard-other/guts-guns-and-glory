package com.chaottic.ggg.common;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tiers;

public final class GutsGunsAndGloryItems {
    public static final Item BARBED_WIRE = new BlockItem(GutsGunsAndGloryBlocks.BARBED_WIRE, new Item.Properties());
    public static final Item LANDMINE = new BlockItem(GutsGunsAndGloryBlocks.LANDMINE, new Item.Properties());
    public static final Item CROWBAR = new Item(new Item.Properties().defaultDurability(Tiers.IRON.getUses()));

    private GutsGunsAndGloryItems() {}

    public static void registerAll() {
        register("barbed_wire", BARBED_WIRE);
        register("landmine", LANDMINE);
        register("crowbar", CROWBAR);
    }

    private static void register(String name, Item item) {
        Registry.register(BuiltInRegistries.ITEM, GutsGunsAndGlory.resourceLocation(name), item);
    }
}
