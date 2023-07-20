package com.chaottic.ggg.common.item;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record BulletType() {
    public static final Codec<BulletType> CODEC = RecordCodecBuilder.create(instance -> instance.group(Codec.FLOAT.fieldOf("placeholder").forGetter(bulletType -> 0.0F)).apply(instance, f -> new BulletType()));

}
