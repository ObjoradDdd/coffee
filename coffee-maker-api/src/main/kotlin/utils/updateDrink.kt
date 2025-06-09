package org.example.utils

import org.example.manager.DrinkManager
import org.example.model.actions.Add

fun updateDrink(manager: DrinkManager) {
    println("Выберите напиток для изменения:")
    val drinks = manager.read()
    getAllDrinks(manager)

    val index = readln().toIntOrNull()
    val drink = drinks.getOrNull(index?.minus(1) ?: -1)

    if (drink != null) {
        manager.update(drink.id) { d ->
            println("1. Добавить ингредиент")
            println("2. Изменить рецепт")
            val choice = readln()

            when (choice) {
                "1" -> {
                    val ing = addIngredient()
                    if (ing != null) d.addAction(Add(ing, d))
                }

                "2" -> {
                    d.actions.clear()
                    d.ingredients.clear()
                    val newDrink = createDrink()
                    for (action in newDrink.actions) {
                        d.addAction(action)
                    }
                }

                else -> println("Неверный выбор!")
            }
        }
    } else println("Неверный выбор!")
}
