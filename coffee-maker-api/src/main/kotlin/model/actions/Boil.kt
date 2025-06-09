package org.example.model.actions

import org.example.model.Action
import org.example.model.ingredients.Water

class Boil : Action() {
    override val name = "Вскипятить"
    override fun doAction() {
        println("Вода вскипячена")
    }

    override fun isAllowed(previousActions: List<Action>): Boolean {
        return previousActions.any { it is Add && it.ingredient is Water }
    }
}