package com.chaottic.ggg.common;

import com.chaottic.ggg.common.item.BulletItem;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tiers;

public final class GutsGunsAndGloryItems {
    public static final Item BARBED_WIRE = new BlockItem(GutsGunsAndGloryBlocks.BARBED_WIRE, new Item.Properties());
    public static final Item LANDMINE = new BlockItem(GutsGunsAndGloryBlocks.LANDMINE, new Item.Properties());
    public static final Item CROWBAR = new Item(new Item.Properties().defaultDurability(Tiers.IRON.getUses()));

    // Bullets
    public static final Item HOLLOW_POINT_BULLET = new BulletItem(GutsGunsAndGloryBulletTypes.HOLLOW_POINT, new Item.Properties());
    public static final Item BALL_BULLET = new BulletItem(GutsGunsAndGloryBulletTypes.BALL, new Item.Properties());
    public static final Item ARMOUR_PIERCING_BULLET = new BulletItem(GutsGunsAndGloryBulletTypes.ARMOUR_PIERCING, new Item.Properties());

    private GutsGunsAndGloryItems() {}

    public static void registerAll() {
        register("barbed_wire", BARBED_WIRE);
        register("landmine", LANDMINE);
        register("crowbar", CROWBAR);
        register("hollow_point_bullet", HOLLOW_POINT_BULLET);
        register("ball_bullet", BALL_BULLET);
        register("armour_piercing_bullet", ARMOUR_PIERCING_BULLET);
    }

    private static void register(String name, Item item) {
        Registry.register(BuiltInRegistries.ITEM, GutsGunsAndGlory.resourceLocation(name), item);
    }
}
