package org.example.model.ingredients

import org.example.model.Ingredient

class CoffeeBean(override val weight: Double) : Ingredient() {
    override val name = "Кофейное зерно"
}