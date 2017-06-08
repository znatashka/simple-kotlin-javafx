package ru.u26c4.javafx

import com.jfoenix.controls.JFXButton
import de.jensd.fx.glyphs.GlyphsDude
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon
import javafx.scene.text.Text

fun first(): JFXButton {
    val btn = JFXButton("CLICK ME!")
    btn.styleClass.add("button-raised")

    btn.setOnAction {
        decorator?.setContent(second())
    }
    return btn
}

fun second(): Text {
    return GlyphsDude.createIcon(FontAwesomeIcon.THUMBS_UP, "10em")
}