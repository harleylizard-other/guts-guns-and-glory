package com.chaottic.ggg.common;

import net.minecraft.resources.ResourceLocation;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;

public final class GutsGunsAndGlory implements ModInitializer {
    private static final String MOD_ID = "ggg";

    @Override
    public void onInitialize(ModContainer mod) {
        GutsGunsAndGloryBlocks.registerAll();
        GutsGunsAndGloryItems.registerAll();
        GutsGunsAndGloryEntityTypes.registerAll();

    }

    public static ResourceLocation resourceLocation(String path) {
        return new ResourceLocation(MOD_ID, path);
    }
}
