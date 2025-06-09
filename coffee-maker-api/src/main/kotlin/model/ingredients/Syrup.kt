package org.example.model.ingredients

import org.example.model.Ingredient

class Syrup(override val weight: Double) : Ingredient() {
    override val name = "Сироп"
}