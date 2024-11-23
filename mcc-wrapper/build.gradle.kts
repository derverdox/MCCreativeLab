plugins {
    id("java")
    id("io.papermc.paperweight.userdev") version "1.7.3"
    id("xyz.jpenilla.run-paper") version "2.3.1" // Adds runServer and runMojangMappedServer tasks for testing

}

group = "de.verdox.mccreativelab"
description = "mcc-wrapper"
version = "1.0"

repositories {
    mavenCentral()
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
    compileOnly("it.unimi.dsi:fastutil:8.5.15")
    compileOnly("com.mojang:authlib:3.13.56")
    implementation("com.google.guava:guava:33.3.1-jre")

    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("org.jetbrains:annotations:26.0.1")
    testImplementation("org.ow2.asm:asm-tree:9.7")
    testImplementation("com.google.guava:guava:33.3.1-jre")
    testImplementation("org.mockito:mockito-core:5.14.2")
}

tasks.test {
    useJUnitPlatform()
}

configure<PublishingExtension> {
    publications.create<MavenPublication>("maven") {
        from(components["java"])
        //artifact(tasks["shadowJar"])
    }
}