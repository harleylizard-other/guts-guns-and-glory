package com.chaottic.ggg.common;

import com.chaottic.ggg.common.item.BulletType;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;

public final class GutsGunsAndGloryBulletTypes {
    public static final ResourceKey<Registry<BulletType>> RESOURCE_KEY = ResourceKey.createRegistryKey(GutsGunsAndGlory.resourceLocation("bullet_type"));

    public static final ResourceKey<BulletType> HOLLOW_POINT = of("hollow_point");
    public static final ResourceKey<BulletType> BALL = of("ball");
    public static final ResourceKey<BulletType> ARMOUR_PIERCING = of("armour_piercing");
    public static final ResourceKey<BulletType> INCENDIARY = of("incendiary");
    public static final ResourceKey<BulletType> SILVER = of("silver");
    public static final ResourceKey<BulletType> HORSESHOT = of("horseshot");
    public static final ResourceKey<BulletType> SLUG = of("slug");
    public static final ResourceKey<BulletType> FLECHETTE = of("flechette");
    public static final ResourceKey<BulletType> DRAGONS_BREATH = of("dragons_breath");
    public static final ResourceKey<BulletType> RUBBER_SLUG = of("rubber_slug");
    public static final ResourceKey<BulletType> FRAG_SHELL = of("frag_shell");
    public static final ResourceKey<BulletType> SMOKE_SHELL = of("smoke_shell");
    public static final ResourceKey<BulletType> STUN_SHELL = of("stun_shell");
    public static final ResourceKey<BulletType> INCENDIARY_SHELL = of("incendiary_shell");
    public static final ResourceKey<BulletType> GAS_SHELL = of("gas_shell");
    public static final ResourceKey<BulletType> FLARE = of("flare");
    public static final ResourceKey<BulletType> SILVER_FLARE = of("silver_flare");
    public static final ResourceKey<BulletType> ECHO_FLARE = of("echo_flare");

    private GutsGunsAndGloryBulletTypes() {}

    private static ResourceKey<BulletType> of(String name) {
        return ResourceKey.create(RESOURCE_KEY, GutsGunsAndGlory.resourceLocation(name));
    }
}
