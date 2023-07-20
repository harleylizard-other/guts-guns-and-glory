import net.fabricmc.loom.api.mappings.layered.spec.LayeredMappingSpecBuilder

plugins {
    id("fabric-loom") version "1.3-SNAPSHOT"
}

loom {
    runs {
        forEach { it.ideConfigGenerated(true) }
    }
}

dependencies {
    minecraft("com.mojang:minecraft:1.20.1")
    mappings(loom.layered(LayeredMappingSpecBuilder::officialMojangMappings))

    modImplementation("net.fabricmc:fabric-loader:0.14.21")
    modImplementation("net.fabricmc.fabric-api:fabric-api:0.85.0+1.20.1")
    modImplementation("mod.azure.azurelib:azurelib-fabric-1.20.1:1.0.19")
}

tasks.processResources {
    inputs.property("version", project.version)

    filesMatching("fabric.mod.json") {
        expand("version" to project.version)
    }
}