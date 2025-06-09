package org.example.model.actions

import org.example.model.Action
import org.example.model.Drink
import org.example.model.Ingredient

class Add(val ingredient: Ingredient, private val drink: Drink) : Action() {
    override val name = "Добавить ${ingredient.name}"
    override fun doAction() {
        drink.addIngredient(ingredient)
        println("Добавлено ${ingredient.name}, масса: ${ingredient.weight}")
    }
}