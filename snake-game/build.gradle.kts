import korlibs.korge.gradle.*

plugins {
    alias(libs.plugins.korge)
}

korge {
    //this.jvmMainClassName = "com.sliderzxc.games.snake.Main"
    id = "com.sliderzxc.games.snake"

    targetAll()

    //targetDefault()

//    targetJvm()
//    targetJs()
//    targetIos()
//    targetAndroid()

    serializationJson()
}