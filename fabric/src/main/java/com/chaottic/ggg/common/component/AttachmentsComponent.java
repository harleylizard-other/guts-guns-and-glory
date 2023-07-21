package com.chaottic.ggg.common.component;

import com.chaottic.ggg.common.Attachments;
import dev.onyxstudios.cca.api.v3.item.ItemComponent;
import net.minecraft.world.item.ItemStack;

public final class AttachmentsComponent extends ItemComponent implements Attachments {
    public AttachmentsComponent(ItemStack stack) {
        super(stack);
    }

    @Override
    public boolean accepts(ItemStack itemStack) {
        if (itemStack.getItem() instanceof Attachments attachments) {
            return attachments.accepts(itemStack);
        }
        return false;
    }
}
