import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    alias(libs.plugins.kotlin.jvm) apply false
    alias(libs.plugins.ksp) apply false
    alias(libs.plugins.korge) apply false
}

allprojects {
    tasks.withType<KotlinCompile> {
        kotlinOptions {
            jvmTarget = "19"
        }
    }
}
