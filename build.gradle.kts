plugins {
    id("java")
    id("io.freefair.lombok") version "8.1.0"
}

group = "com.chaottic"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}

subprojects {
    apply(plugin = "java")
    apply(plugin = "io.freefair.lombok")

    repositories {
        maven("https://dl.cloudsmith.io/public/azuredoom-mods/azurelib/maven/")
        maven("https://maven.terraformersmc.com/releases/")
    }
}

allprojects {
    version = "1.0-SNAPSHOT"

    java {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}