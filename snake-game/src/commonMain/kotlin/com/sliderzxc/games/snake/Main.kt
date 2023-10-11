package com.sliderzxc.games.snake

import korlibs.image.color.Colors
import korlibs.image.format.readBitmap
import korlibs.io.file.std.resourcesVfs
import korlibs.korge.Korge
import korlibs.korge.scene.Scene
import korlibs.korge.scene.sceneContainer
import korlibs.korge.tween.get
import korlibs.korge.tween.tween
import korlibs.korge.view.*
import korlibs.math.geom.Size
import korlibs.math.geom.degrees
import korlibs.math.interpolation.Easing
import korlibs.time.seconds

suspend fun main() = Korge(windowSize = Size(512, 512), backgroundColor = Colors["#2b2b2b"]) {
    val sceneContainer = sceneContainer()

    sceneContainer.changeTo({ MyScene() })
}

class MyScene : Scene() {
    override suspend fun SContainer.sceneMain() {
        val minDegrees = (-16).degrees
        val maxDegrees = (+16).degrees


        val image = image(
            resourcesVfs["com/sliderzxc/games/snake/korge.png"].readBitmap()
        ) {
            rotation = maxDegrees
            anchor(.5, .5)
            scale(0.8)
            position(256, 256)
        }

        while (true) {
            image.tween(image::rotation[minDegrees], time = 1.seconds, easing = Easing.EASE_IN_OUT)
            image.tween(image::rotation[maxDegrees], time = 1.seconds, easing = Easing.EASE_IN_OUT)
        }
    }
}
