package ru.u26c4.javafx

import com.jfoenix.controls.JFXDecorator
import io.datafx.controller.flow.container.DefaultFlowContainer
import javafx.application.Application
import javafx.scene.Scene
import javafx.scene.layout.StackPane
import javafx.stage.Stage

class App : Application() {

    override fun start(stage: Stage) {
        val decorator = JFXDecorator(stage, DefaultFlowContainer(StackPane()).view)
        decorator.isCustomMaximize = true

        first(decorator)

        val scene = Scene(decorator, 400.0, 450.0)
        scene.stylesheets.add(App::class.java.getResource("/css/jfoenix-components.css").toExternalForm())

        stage.minWidth = 300.0
        stage.minHeight = 400.0
        stage.scene = scene
        stage.show()
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            launch(App::class.java)
        }
    }
}