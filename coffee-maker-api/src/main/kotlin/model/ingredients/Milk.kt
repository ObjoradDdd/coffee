package org.example.model.ingredients

import org.example.model.Ingredient

class Milk(override val weight: Double) : Ingredient() {
    override val name = "Молоко";
}