@file:Suppress("GradlePackageUpdate")

plugins {
  kotlin("jvm") version "1.6.10"
  id("org.openjfx.javafxplugin") version "0.0.10"
}

javafx {
  version = "17"
  modules = listOf("javafx.controls")
}

repositories {
  mavenCentral()
  mavenLocal()
}

dependencies {
  implementation("com.jkschneider:processing4:4.0-b5")
  implementation("com.jkschneider:processing4-javafx:4.0-b5")
  implementation("org.jetbrains.kotlin:kotlin-reflect")

  implementation("org.ow2.asm:asm:latest.release")
  implementation("org.ow2.asm:asm-util:latest.release")
}
