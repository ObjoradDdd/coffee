package org.example.model.actions

import org.example.model.Action
import org.example.model.ingredients.Water

class Pour : Action() {
    override val name = "Пролить"
    override fun doAction() {
        println("Пролито через кофе")
    }

    override fun isAllowed(previousActions: List<Action>): Boolean {
        return previousActions.any { it is Add && it.ingredient is Water }
    }
}