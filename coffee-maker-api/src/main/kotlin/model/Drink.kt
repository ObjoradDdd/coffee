package org.example.model

import java.util.UUID

class Drink(
    val displayName: String,
    val actions: MutableList<Action> = mutableListOf(),
    val ingredients: MutableList<Ingredient> = mutableListOf(),
) : Element {
    val id: UUID = UUID.randomUUID()

    override val name: String
        get() = displayName

    fun addIngredient(ingredient: Ingredient) {
        ingredients.add(ingredient)
    }

    fun addAction(action: Action) {
        if (action.isAllowed(actions)) actions.add(action)
        else println("Действие `${action.name}` невозможно!")
    }

    fun make() {
        println("Готовим ${displayName}...")
        for (action in actions) {
            action.doAction()
        }
    }
}