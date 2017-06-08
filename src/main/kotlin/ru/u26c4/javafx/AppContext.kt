package ru.u26c4.javafx

import com.jfoenix.controls.JFXDecorator
import io.datafx.controller.flow.container.DefaultFlowContainer
import javafx.scene.layout.StackPane
import javafx.stage.Stage

var decorator: JFXDecorator? = null

fun createContext(stage: Stage) {
    decorator = JFXDecorator(stage, DefaultFlowContainer(StackPane()).view)
}