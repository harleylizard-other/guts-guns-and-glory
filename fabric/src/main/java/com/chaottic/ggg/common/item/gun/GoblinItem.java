package com.chaottic.ggg.common.item.gun;

import com.chaottic.ggg.client.GunRenderer;
import com.chaottic.ggg.common.Attachments;
import lombok.Getter;
import mod.azure.azurelib.animatable.client.RenderProvider;

import java.util.function.Consumer;

public final class GoblinItem extends GunItem implements Attachments {
    public GoblinItem(Properties properties) {
        super(properties);
    }

    @Override
    public void createRenderer(Consumer<Object> consumer) {
        consumer.accept(new RenderProvider() {
            @Getter
            private final GunRenderer renderer = new GunRenderer("goblin");

        });
    }
}
