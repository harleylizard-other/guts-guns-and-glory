package com.chaottic.ggg.common;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.EntityType;

public final class GutsGunsAndGloryEntityTypes {

    private GutsGunsAndGloryEntityTypes() {}

    public static void registerAll() {

    }

    private static void register(String name, EntityType<?> type) {
        Registry.register(BuiltInRegistries.ENTITY_TYPE, GutsGunsAndGlory.resourceLocation(name), type);
    }
}
