package org.example.utils

import org.example.manager.DrinkManager

fun getAllDrinks(manager: DrinkManager) {
    println("Все напитки:")
    manager.read().forEachIndexed { index, drink ->
        println("${index + 1}. ${drink.name} (id: ${drink.id})")
    }
}