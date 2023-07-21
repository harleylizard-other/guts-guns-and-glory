package com.chaottic.ggg.client;

import com.chaottic.ggg.common.GutsGunsAndGlory;
import com.chaottic.ggg.common.item.gun.GunItem;
import mod.azure.azurelib.model.DefaultedItemGeoModel;
import mod.azure.azurelib.renderer.GeoItemRenderer;

public final class GunRenderer extends GeoItemRenderer<GunItem> {
    public GunRenderer(String name) {
        super(new DefaultedItemGeoModel<>(GutsGunsAndGlory.resourceLocation(name)));
    }
}
