package com.chaottic.ggg.common.mixin;

import com.chaottic.ggg.common.GutsGunsAndGloryBulletTypes;
import com.chaottic.ggg.common.item.BulletType;
import net.minecraft.resources.RegistryDataLoader;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Mixin(RegistryDataLoader.class)
public final class RegistryDataLoaderMixin {
    @Final
    @Shadow
    @Mutable
    public static List<RegistryDataLoader.RegistryData<?>> WORLDGEN_REGISTRIES;

    static {
        var registries = new ArrayList<RegistryDataLoader.RegistryData<?>>();
        registries.addAll(WORLDGEN_REGISTRIES);
        registries.add(new RegistryDataLoader.RegistryData<>(GutsGunsAndGloryBulletTypes.RESOURCE_KEY, BulletType.CODEC));

        WORLDGEN_REGISTRIES = Collections.unmodifiableList(registries);
    }

}
