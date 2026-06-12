plugins {
    id("fabric-loom") version "1.8-SNAPSHOT"
}

sourceCompatibility = JavaVersion.VERSION_21
targetCompatibility = JavaVersion.VERSION_21

archivesBaseName = project.property("archives_base_name").toString()
version = project.property("mod_version").toString()
group = project.property("maven_group").toString()

repositories {
    mavenCentral()
    maven("https://maven.meteordev.org/releases")
    maven("https://maven.meteordev.org/snapshots")
}

dependencies {
    minecraft("com.mojang:minecraft:${project.property("minecraft_version")}")
    mappings("net.fabricmc:yarn:${project.property("yarn_mappings")}:v2")
    modImplementation("net.fabricmc:fabric-loader:${project.property("loader_version")}")
    modImplementation("meteordevelopment:meteor-client:${project.property("meteor_version")}-SNAPSHOT")
}

tasks.withType<JavaCompile> {
    options.release.set(21)
}
