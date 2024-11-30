import org.objectweb.asm.*
import java.net.URLClassLoader

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
    implementation("net.bytebuddy:byte-buddy:1.15.10")

    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("org.jetbrains:annotations:26.0.1")
    testImplementation("org.ow2.asm:asm-tree:9.7")
    testImplementation("com.google.guava:guava:33.3.1-jre")
    testImplementation("org.mockito:mockito-core:5.14.2")
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21)) // oder 17, falls gewünscht
    }
}

tasks.test {
    useJUnitPlatform()
}

/*tasks.register("checkMCCInstantiationSource") {
    group = "verification"
    description = "Prüft, ob Klassen, die ein bestimmtes Interface implementieren, die Annotation @MCCInstantiationSource korrekt verwenden."

    dependsOn("classes") // Stellt sicher, dass Klassen zuerst kompiliert werden

    doLast {
        val classesDir = file("${project.buildDir}/classes/java/main")
        if (!classesDir.exists()) {
            throw GradleException("Klassen wurden noch nicht kompiliert. Bitte führen Sie zuerst 'gradle build' aus.")
        }



        // Pfade zu den Abhängigkeiten (JARs im runtimeClasspath)
        val runtimeClasspath = configurations.compileClasspath.get().files.map { it.toURI().toURL() }

        // Alle Pfade (Kompilierte Klassen + Abhängigkeiten) in den ClassLoader laden
        val classLoaderUrls = runtimeClasspath + classesDir.toURI().toURL()
        val classLoader = URLClassLoader(classLoaderUrls.toTypedArray(), this.javaClass.classLoader)


        // Interface und Annotation laden
        val parentInterface = classLoader.loadClass("de.verdox.mccreativelab.wrapper.MCCBuiltIn") // Ersetze durch dein Interface
        val annotationClass = classLoader.loadClass("de.verdox.mccreativelab.wrapper.annotations.MCCInstantiationSource").asSubclass(Annotation::class.java) // Ersetze durch deine Annotation

        classesDir.walkTopDown()
            .filter { it.extension == "class" }
            .forEach { classFile ->
                val className = classFile.relativeTo(classesDir)
                    .path
                    .replace("/", ".")
                    .replace("\\", ".")
                    .removeSuffix(".class")

                try {
                    val clazz = classLoader.loadClass(className)
                    val annotationInstance = clazz.getAnnotation(annotationClass)
                    if (parentInterface.isAssignableFrom(clazz) && clazz != parentInterface && clazz.isInterface) {
                        if (annotationInstance == null) {
                            throw GradleException("Klasse $className implementiert ${parentInterface.simpleName}, hat aber keine @MCCInstantiationSource Annotation.")
                        }

                        // Prüfen, ob das Array nicht leer ist
                        val sourceClassesMethod = annotationInstance.javaClass.getMethod("sourceClasses")
                        val sourceClasses = sourceClassesMethod.invoke(annotationInstance) as Array<*>
                        if (sourceClasses.isEmpty()) {
                            throw GradleException("Klasse $className hat ein leeres sourceClasses-Array in @MCCInstantiationSource.")
                        }
                    }
                    else if(annotationInstance != null){
                        throw GradleException("Class $className does not implement MCCBuiltIn, but has a @MCCInstantiationSource Annotation.")
                    }
                } catch (e: Exception) {
                    // Fehler protokollieren, damit IntelliJ sie als Fehlerquelle auflösen kann
                    val className = e.stackTrace.firstOrNull()?.className
                    val lineNumber = e.stackTrace.firstOrNull()?.lineNumber
                    val message = "Fehler beim Verarbeiten der Klasse: ${e.message}"
                    logger.error(message)
                    //throw GradleException(message, e)  // Der Fehler wird so geworfen, dass er in IntelliJ eine Zeilennummer zeigt.
                }
            }
    }
}*/

// Damit der Task vor dem Build ausgeführt wird
tasks.named("build") {
    dependsOn("checkMCCInstantiationSource")
}

configure<PublishingExtension> {
    publications.create<MavenPublication>("maven") {
        from(components["java"])
        //artifact(tasks["shadowJar"])
    }
}