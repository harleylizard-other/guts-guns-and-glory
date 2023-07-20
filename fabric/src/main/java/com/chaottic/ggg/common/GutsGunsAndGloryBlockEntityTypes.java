package com.chaottic.ggg.common;

import com.chaottic.ggg.common.block.entity.MunitionsBoxBlockEntity;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.entity.BlockEntityType;

public final class GutsGunsAndGloryBlockEntityTypes {
    public static final BlockEntityType<MunitionsBoxBlockEntity> MUNITIONS_BOX = FabricBlockEntityTypeBuilder.create(MunitionsBoxBlockEntity::new, GutsGunsAndGloryBlocks.MUNITIONS_BOX).build();

    private GutsGunsAndGloryBlockEntityTypes() {}

    public static void registerAll() {
        register("munitions_box", MUNITIONS_BOX);
    }

    private static void register(String name, BlockEntityType<?> type) {
        Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE, GutsGunsAndGlory.resourceLocation(name), type);
    }
}
