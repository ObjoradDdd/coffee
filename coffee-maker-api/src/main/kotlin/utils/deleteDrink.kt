package org.example.utils

import org.example.manager.DrinkManager

fun deleteDrink(manager: DrinkManager) {
    println("Выберите напиток для удаления:")
    val drinks = manager.read()
    getAllDrinks(manager)

    val index = readln().toIntOrNull()
    val drink = drinks.getOrNull(index?.minus(1) ?: -1)

    if (drink != null) {
        manager.delete(drink.id)
        println("Удалено.")
    } else println("Неверный выбор!")
}
