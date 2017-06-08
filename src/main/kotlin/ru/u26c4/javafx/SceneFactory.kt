package ru.u26c4.javafx

import com.jfoenix.controls.JFXButton
import com.jfoenix.controls.JFXDecorator
import de.jensd.fx.glyphs.GlyphsDude
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon
import javafx.scene.control.Label
import javafx.scene.layout.StackPane

fun first(decorator: JFXDecorator) {
    val btn = JFXButton("RAISED BUTTON")
    btn.styleClass.add("button-raised")

    btn.setOnAction {
        second(decorator)
    }
    decorator.setContent(btn)
}

fun second(decorator: JFXDecorator) {
    decorator.setContent(GlyphsDude.createIcon(FontAwesomeIcon.THUMBS_UP, "10em"))
}