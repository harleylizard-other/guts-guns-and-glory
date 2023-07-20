package com.chaottic.ggg.common;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.Block;

public final class GutsGunsAndGloryBlocks {

    private GutsGunsAndGloryBlocks() {}

    public static void registerAll() {

    }

    private static void register(String name, Block block) {
        Registry.register(BuiltInRegistries.BLOCK, GutsGunsAndGlory.resourceLocation(name), block);
    }
}
