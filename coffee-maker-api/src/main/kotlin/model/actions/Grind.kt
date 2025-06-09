package org.example.model.actions

import org.example.model.Action
import org.example.model.Ingredient
import org.example.model.ingredients.CoffeeBean
import org.example.model.ingredients.Water

class Grind : Action() {
    override val name = "Перемолоть"
    override fun doAction() {
        println("Кофейные зерна перемолоты")
    }

    override fun isAllowed(previousActions: List<Action>): Boolean {
        return previousActions.any { it is Add && it.ingredient is CoffeeBean }
    }
}