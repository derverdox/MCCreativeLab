plugins {
    id("java")
    id("io.papermc.paperweight.userdev") version "1.7.3"
    id("xyz.jpenilla.run-paper") version "2.3.1" // Adds runServer and runMojangMappedServer tasks for testing
    id("com.github.johnrengelman.shadow") version "8.1.1" apply true
}

group = "de.verdox.mccreativelab"
description = "mcc-class-generator"
version = "1.0"

repositories {
    mavenCentral()
    mavenLocal()
}

tasks{
    named<com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar>("shadowJar") {
        archiveClassifier.set("") // Entfernt das "-all" Suffix
    }
}

sourceSets {
    main {
        java {
            srcDir("generated")
        }
    }
}

dependencies {
    paperweight.paperDevBundle("1.21.1-R0.1-SNAPSHOT")
    compileOnly("net.kyori:adventure-api:4.17.0")
    //implementation(project(":mcc-wrapper"))
    implementation("de.verdox.mccreativelab:mcc-wrapper:1.0")
    implementation("com.google.guava:guava:33.3.1-jre")
    implementation("org.reflections:reflections:0.10.2")
    implementation("net.bytebuddy:byte-buddy:1.15.10")

    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("org.jetbrains:annotations:26.0.1")
    testImplementation("org.ow2.asm:asm-tree:9.7")
    testImplementation("com.google.guava:guava:33.3.1-jre")
}

publishing {
    publications.create<MavenPublication>("maven").from(components["java"]);
    repositories.maven(repositories.mavenLocal())
}

tasks.test {
    useJUnitPlatform()
}