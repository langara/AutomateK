plugins {
    id("org.jetbrains.intellij") version "0.4.16"
    kotlin("jvm") version "1.3.70-eap-42"
}

group = "pl.mareklangiewicz"
version = "1.0-SNAPSHOT"

repositories {
    maven { setUrl("https://dl.bintray.com/kotlin/kotlin-eap") }
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
}

// See https://github.com/JetBrains/gradle-intellij-plugin/
intellij {
    version = "2019.3.2"
}
tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
    compileTestKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
}
tasks.getByName<org.jetbrains.intellij.tasks.PatchPluginXmlTask>("patchPluginXml") {
    changeNotes("""
      Add change notes here.<br>
      <em>most HTML tags may be used</em>""")
}