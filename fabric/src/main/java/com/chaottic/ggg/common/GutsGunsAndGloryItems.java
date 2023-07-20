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

    // Bullets, RIP naming conventions.
    public static final Item HOLLOW_POINT_762_BULLET = new BulletItem(GutsGunsAndGloryBulletTypes.HOLLOW_POINT, new Item.Properties());
    public static final Item HOLLOW_POINT_556_BULLET = new BulletItem(GutsGunsAndGloryBulletTypes.HOLLOW_POINT, new Item.Properties());
    public static final Item HOLLOW_POINT_545_BULLET = new BulletItem(GutsGunsAndGloryBulletTypes.HOLLOW_POINT, new Item.Properties());
    public static final Item HOLLOW_POINT_338_LAPUA_BULLET = new BulletItem(GutsGunsAndGloryBulletTypes.HOLLOW_POINT, new Item.Properties());
    public static final Item HOLLOW_POINT_308_WINCHESTER_BULLET = new BulletItem(GutsGunsAndGloryBulletTypes.HOLLOW_POINT, new Item.Properties());
    public static final Item HOLLOW_POINT_9_BULLET = new BulletItem(GutsGunsAndGloryBulletTypes.HOLLOW_POINT, new Item.Properties());
    public static final Item HOLLOW_POINT_700_EXPRESS_BULLET = new BulletItem(GutsGunsAndGloryBulletTypes.HOLLOW_POINT, new Item.Properties());
    public static final Item HOLLOW_POINT_357_BULLET = new BulletItem(GutsGunsAndGloryBulletTypes.HOLLOW_POINT, new Item.Properties());
    public static final Item HOLLOW_POINT_45_ACP_BULLET = new BulletItem(GutsGunsAndGloryBulletTypes.HOLLOW_POINT, new Item.Properties());
    public static final Item HOLLOW_POINT_22_LR_BULLET = new BulletItem(GutsGunsAndGloryBulletTypes.HOLLOW_POINT, new Item.Properties());


    private GutsGunsAndGloryItems() {}

    public static void registerAll() {
        register("barbed_wire", BARBED_WIRE);
        register("landmine", LANDMINE);
        register("crowbar", CROWBAR);
        register("hollow_point_762_bullet", HOLLOW_POINT_762_BULLET);
        register("hollow_point_556_bullet", HOLLOW_POINT_556_BULLET);
        register("hollow_point_545_bullet", HOLLOW_POINT_545_BULLET);
        register("hollow_point_338_lapua_bullet", HOLLOW_POINT_338_LAPUA_BULLET);
        register("hollow_point_308_winchester_bullet", HOLLOW_POINT_308_WINCHESTER_BULLET);
        register("hollow_point_9_bullet", HOLLOW_POINT_9_BULLET);
        register("hollow_point_700_express_bullet", HOLLOW_POINT_700_EXPRESS_BULLET);
        register("hollow_point_357_bullet", HOLLOW_POINT_357_BULLET);
        register("hollow_point_45_bullet", HOLLOW_POINT_45_ACP_BULLET);
        register("hollow_point_22_lr_bullet", HOLLOW_POINT_22_LR_BULLET);
    }

    private static void register(String name, Item item) {
        Registry.register(BuiltInRegistries.ITEM, GutsGunsAndGlory.resourceLocation(name), item);
    }
}
