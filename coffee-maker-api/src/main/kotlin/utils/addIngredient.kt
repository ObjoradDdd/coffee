package org.example.utils

import org.example.model.Ingredient
import org.example.model.ingredients.CoffeeBean
import org.example.model.ingredients.Ice
import org.example.model.ingredients.Milk
import org.example.model.ingredients.Syrup
import org.example.model.ingredients.Water

fun addIngredient(): Ingredient? {
    print("Введите тип ингредиента (вода/молоко/сироп/лёд/кофейное зерно): ")
    val type = readln()
    print("Введите массу (граммы): ")
    val weight = readln().toDoubleOrNull() ?: return null

    return when (type.lowercase()) {
        "вода" -> Water(weight)
        "молоко" -> Milk(weight)
        "кофейное зерно" -> CoffeeBean(weight)
        "сироп" -> Syrup(weight)
        "лёд" -> Ice(weight)
        else -> {
            println("Неизвестный ингредиент.")
            null
        }
    }
}