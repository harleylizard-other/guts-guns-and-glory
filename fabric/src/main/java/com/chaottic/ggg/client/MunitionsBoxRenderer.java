package com.chaottic.ggg.client;

import com.chaottic.ggg.common.GutsGunsAndGlory;
import com.chaottic.ggg.common.block.entity.MunitionsBoxBlockEntity;
import mod.azure.azurelib.model.DefaultedBlockGeoModel;
import mod.azure.azurelib.renderer.GeoBlockRenderer;

public final class MunitionsBoxRenderer extends GeoBlockRenderer<MunitionsBoxBlockEntity> {
    public MunitionsBoxRenderer() {
        super(new DefaultedBlockGeoModel<>(GutsGunsAndGlory.resourceLocation("munitions_box")));
    }
}
