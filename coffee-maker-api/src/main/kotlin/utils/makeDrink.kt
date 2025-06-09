package org.example.utils

import org.example.manager.DrinkManager

fun makeDrink(manager: DrinkManager) {
    println("Выберите напиток для создания:")
    val drinks = manager.read()
    getAllDrinks(manager)

    val index = readln().toIntOrNull()
    val drink = drinks.getOrNull(index?.minus(1) ?: -1)

    if (drink != null) {
        drink.make()
    } else {
        println("Неверный номер.")
    }
}