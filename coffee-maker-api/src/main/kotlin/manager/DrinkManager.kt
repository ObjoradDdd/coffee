package org.example.manager

import org.example.model.Drink
import java.util.UUID

class DrinkManager {
    private val drinks: MutableList<Drink> = mutableListOf()

    fun create(drink: Drink) {
        drinks.add(drink)
    }

    fun update(id: UUID, updateFn: (Drink) -> Unit) {
        val index = drinks.indexOfFirst { it.id == id }
        if (index >= 0) {
            updateFn(drinks[index])
        }
    }

    fun delete(id: UUID) {
        val index = drinks.indexOfFirst { it.id == id }
        drinks.removeAt(index)
    }

    fun read(): List<Drink> = drinks.toList()
}