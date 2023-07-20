plugins {
    id("java")
}

group = "com.chaottic"
version = "1.0-SNAPSHOT"

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

    repositories {
        maven("https://dl.cloudsmith.io/public/azuredoom-mods/azurelib/maven/")
        maven("https://maven.terraformersmc.com/releases/")
    }
}

allprojects {
    java {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}