plugins {
    id("java")
}

group = "de.verdox.mccreativelab"
description = "mcc-pack-generator"
version = "1.0"

repositories {
    mavenCentral()
    mavenLocal()
}

dependencies {
    implementation(project(":mcc-util"))
    implementation(project(":mcc-wrapper"))
    compileOnly("org.jetbrains:annotations:26.0.1")
    compileOnly("io.vertx:vertx-core:4.5.10")
    compileOnly("com.hierynomus:sshj:0.38.0")
    compileOnly("org.tukaani:xz:1.9")
    compileOnly("de.verdox.vserializer:vserializer:+")
    compileOnly("commons-io:commons-io:2.17.0")
    compileOnly("com.google.code.gson:gson:2.11.0")
    compileOnly("net.kyori:adventure-api:4.17.0")
    compileOnly("org.apache.commons:commons-lang3:3.17.0")
    compileOnly("ws.schild:jave-all-deps:3.5.0")
    compileOnly("com.google.guava:guava:33.3.1-jre")
    compileOnly("org.apache.commons:commons-compress:1.27.1")


    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}