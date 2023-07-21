package com.chaottic.ggg.common;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;

public final class GutsGunsAndGlory implements ModInitializer {
    private static final String MOD_ID = "ggg";

    private static final ResourceKey<CreativeModeTab> CREATIVE_MODE_TAB = ResourceKey.create(Registries.CREATIVE_MODE_TAB, resourceLocation("main"));

    @Override
    public void onInitialize() {
        GutsGunsAndGloryBlocks.registerAll();
        GutsGunsAndGloryItems.registerAll();
        GutsGunsAndGloryEntityTypes.registerAll();
        GutsGunsAndGloryBlockEntityTypes.registerAll();

        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, CREATIVE_MODE_TAB, FabricItemGroup.builder()
                .icon(GutsGunsAndGloryItems.BARBED_WIRE::getDefaultInstance)
                .title(Component.translatable("itemGroup.ggg"))
                .displayItems((itemDisplayParameters, output) -> {
                    output.accept(GutsGunsAndGloryItems.BARBED_WIRE);
                    output.accept(GutsGunsAndGloryItems.LANDMINE);
                    output.accept(GutsGunsAndGloryItems.MUNITIONS_BOX);
                    output.accept(GutsGunsAndGloryItems.CROWBAR);
                    output.accept(GutsGunsAndGloryItems.HOLLOW_POINT_762_BULLET);
                    output.accept(GutsGunsAndGloryItems.HOLLOW_POINT_556_BULLET);
                    output.accept(GutsGunsAndGloryItems.HOLLOW_POINT_545_BULLET);
                    output.accept(GutsGunsAndGloryItems.HOLLOW_POINT_338_LAPUA_BULLET);
                    output.accept(GutsGunsAndGloryItems.HOLLOW_POINT_308_WINCHESTER_BULLET);
                    output.accept(GutsGunsAndGloryItems.HOLLOW_POINT_9_BULLET);
                    output.accept(GutsGunsAndGloryItems.HOLLOW_POINT_700_EXPRESS_BULLET);
                    output.accept(GutsGunsAndGloryItems.HOLLOW_POINT_357_BULLET);
                    output.accept(GutsGunsAndGloryItems.HOLLOW_POINT_45_ACP_BULLET);
                    output.accept(GutsGunsAndGloryItems.HOLLOW_POINT_22_LR_BULLET);
                    output.accept(GutsGunsAndGloryItems.AUTOMATIC_22);
                    output.accept(GutsGunsAndGloryItems.CARLTON_9);
                    output.accept(GutsGunsAndGloryItems.GOBLIN);
                    output.accept(GutsGunsAndGloryItems.HAWK);
                    output.accept(GutsGunsAndGloryItems.MARKOV);
                    output.accept(GutsGunsAndGloryItems.SNUB_NOSE);
                    output.accept(GutsGunsAndGloryItems.STALLION_CO);
                }).build());
    }

    public static ResourceLocation resourceLocation(String path) {
        return new ResourceLocation(MOD_ID, path);
    }
}
