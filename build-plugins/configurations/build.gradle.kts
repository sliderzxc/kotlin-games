plugins {
    `kotlin-dsl`
    `kotlin-dsl-precompiled-script-plugins`
}

repositories {
    mavenCentral()
    google()
    gradlePluginPortal()
}

kotlin {
    jvmToolchain(17)
}

dependencies {
    api(libs.kotlin.plugin)
    api(libs.ksp.plugin)
}