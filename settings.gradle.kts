pluginManagement {
	repositories {
		maven("https://maven.quiltmc.org/repository/release")
		maven("https://maven.fabricmc.net/")
		mavenCentral()
		gradlePluginPortal()
	}
}
rootProject.name = "guts-guns-and-glory"
include("quilt")
include("fabric")
