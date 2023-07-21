package com.chaottic.ggg.common;

import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.EntityType;

public final class GutsGunsAndGloryEntityTypeTags {
    public static final TagKey<EntityType<?>> CAN_BLEED = of("can_bleed");
    public static final TagKey<EntityType<?>> CAN_BE_UNCONSCIOUS = of("can_be_unconscious");

    private GutsGunsAndGloryEntityTypeTags() {}

    private static TagKey<EntityType<?>> of(String name) {
        return TagKey.create(Registries.ENTITY_TYPE, GutsGunsAndGlory.resourceLocation(name));
    }
}
