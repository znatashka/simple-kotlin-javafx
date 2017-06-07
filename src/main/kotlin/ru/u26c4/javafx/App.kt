package ru.u26c4.javafx

import com.jfoenix.controls.JFXButton
import com.jfoenix.controls.JFXDecorator
import com.jfoenix.controls.JFXDialog
import de.jensd.fx.glyphs.GlyphsDude
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon
import io.datafx.controller.flow.container.DefaultFlowContainer
import javafx.application.Application
import javafx.scene.Scene
import javafx.scene.control.Label
import javafx.scene.layout.StackPane
import javafx.stage.Stage


class App : Application() {

    override fun start(stage: Stage) {
        val pane = StackPane()
        val decorator = JFXDecorator(stage, DefaultFlowContainer(pane).view)
        decorator.isCustomMaximize = true

        val btn = JFXButton("RAISED BUTTON")
        btn.styleClass.add("button-raised")

        val label = Label()
        GlyphsDude.setIcon(label, FontAwesomeIcon.THUMBS_UP, "10em")

        val dialog = JFXDialog(pane, label, JFXDialog.DialogTransition.CENTER)

        btn.setOnMouseClicked {
            dialog.show()
        }

        pane.children.add(btn)

        decorator.isCustomMaximize = true

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