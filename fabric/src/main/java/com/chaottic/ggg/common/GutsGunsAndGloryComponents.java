package com.chaottic.ggg.common;

import com.chaottic.ggg.common.component.AttachmentsComponent;
import dev.onyxstudios.cca.api.v3.component.ComponentKey;
import dev.onyxstudios.cca.api.v3.component.ComponentRegistry;
import dev.onyxstudios.cca.api.v3.item.ItemComponentFactoryRegistry;
import dev.onyxstudios.cca.api.v3.item.ItemComponentInitializer;

public final class GutsGunsAndGloryComponents implements ItemComponentInitializer {
    public static final ComponentKey<AttachmentsComponent> ATTACHMENTS = ComponentRegistry.getOrCreate(GutsGunsAndGlory.resourceLocation("attachments"), AttachmentsComponent.class);

    @Override
    public void registerItemComponentFactories(ItemComponentFactoryRegistry registry) {
        registry.register(GutsGunsAndGloryItems.AUTOMATIC_22, ATTACHMENTS, AttachmentsComponent::new);
        registry.register(GutsGunsAndGloryItems.CARLTON_9, ATTACHMENTS, AttachmentsComponent::new);
        registry.register(GutsGunsAndGloryItems.GOBLIN, ATTACHMENTS, AttachmentsComponent::new);
        registry.register(GutsGunsAndGloryItems.HAWK, ATTACHMENTS, AttachmentsComponent::new);
        registry.register(GutsGunsAndGloryItems.MARKOV, ATTACHMENTS, AttachmentsComponent::new);
        registry.register(GutsGunsAndGloryItems.STALLION_CO, ATTACHMENTS, AttachmentsComponent::new);
    }
}
