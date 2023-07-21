package com.chaottic.ggg.common.item.gun;

import com.chaottic.ggg.client.GunRenderer;
import lombok.Getter;
import mod.azure.azurelib.animatable.client.RenderProvider;

import java.util.function.Consumer;

public final class SnubNoseItem extends GunItem {
    public SnubNoseItem(Properties properties) {
        super(properties);
    }

    @Override
    public void createRenderer(Consumer<Object> consumer) {
        consumer.accept(new RenderProvider() {
            @Getter
            private final GunRenderer customRenderer = new GunRenderer("snub_nose");

        });
    }
}
