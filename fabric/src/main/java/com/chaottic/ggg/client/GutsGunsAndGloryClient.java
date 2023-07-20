package com.chaottic.ggg.client;

import com.chaottic.ggg.common.GutsGunsAndGloryBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.renderer.RenderType;

public final class GutsGunsAndGloryClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(GutsGunsAndGloryBlocks.BARBED_WIRE, RenderType.cutoutMipped());
    }
}
