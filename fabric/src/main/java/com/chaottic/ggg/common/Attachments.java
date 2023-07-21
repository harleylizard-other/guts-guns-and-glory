package com.chaottic.ggg.common;

import net.minecraft.world.item.ItemStack;

public interface Attachments {

    default boolean accepts(ItemStack itemStack) {
        return false;
    }
}
