@file:Suppress("GradlePackageUpdate")

plugins {
  kotlin("jvm") version "1.6.10"
}

kotlin {
  jvmToolchain {
    (this as JavaToolchainSpec).languageVersion.set(JavaLanguageVersion.of("8"))
  }
}

repositories {
  mavenCentral()
}

dependencies {
  implementation("org.processing:core:latest.release")
}
