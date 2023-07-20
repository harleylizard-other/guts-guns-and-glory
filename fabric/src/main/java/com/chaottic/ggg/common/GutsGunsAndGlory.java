package com.chaottic.ggg.common;

import net.fabricmc.api.ModInitializer;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;

public final class GutsGunsAndGlory implements ModInitializer {
    private static final String MOD_ID = "com/chaottic/ggg";

    private static final ResourceKey<CreativeModeTab> CREATIVE_MODE_TAB = ResourceKey.create(Registries.CREATIVE_MODE_TAB, resourceLocation("main"));

    @Override
    public void onInitialize() {
        GutsGunsAndGloryBlocks.registerAll();
        GutsGunsAndGloryItems.registerAll();
        GutsGunsAndGloryEntityTypes.registerAll();

        // Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, CREATIVE_MODE_TAB, FabricIt.builder()
        //         .icon(GutsGunsAndGloryItems.BARBED_WIRE::getDefaultInstance)
        //         .title(Component.translatable("itemGroup.ggg"))
        //         .displayItems((itemDisplayParameters, output) -> {
        //             output.accept(GutsGunsAndGloryItems.BARBED_WIRE);
        //             output.accept(GutsGunsAndGloryItems.LANDMINE);
        //             output.accept(GutsGunsAndGloryItems.CROWBAR);
        //         }).build());
    }

    public static ResourceLocation resourceLocation(String path) {
        return new ResourceLocation(MOD_ID, path);
    }
}
