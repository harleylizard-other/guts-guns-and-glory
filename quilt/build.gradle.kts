import net.fabricmc.loom.api.mappings.layered.spec.LayeredMappingSpecBuilder

plugins {
    alias(libs.plugins.quilt.loom)
}

loom {
    runs {
        forEach { it.ideConfigGenerated(true) }
    }
}

dependencies {
    minecraft(libs.minecraft)
    mappings(loom.layered(LayeredMappingSpecBuilder::officialMojangMappings))

    modImplementation(libs.quilt.loader)
    modImplementation(libs.quilted.fabric.api)
}