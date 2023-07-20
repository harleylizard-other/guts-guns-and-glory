package com.chaottic.ggg.common;

import com.chaottic.ggg.common.block.BarbedWireBlock;
import com.chaottic.ggg.common.block.LandmineBlock;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public final class GutsGunsAndGloryBlocks {
    public static final Block BARBED_WIRE = new BarbedWireBlock(BlockBehaviour.Properties.copy(Blocks.STONE));
    public static final Block LANDMINE = new LandmineBlock(BlockBehaviour.Properties.copy(Blocks.STONE));

    private GutsGunsAndGloryBlocks() {}

    public static void registerAll() {
        register("barbed_wire", BARBED_WIRE);
        register("landmine", LANDMINE);
    }

    private static void register(String name, Block block) {
        Registry.register(BuiltInRegistries.BLOCK, GutsGunsAndGlory.resourceLocation(name), block);
    }
}
