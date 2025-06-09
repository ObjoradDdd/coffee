package org.example

import org.example.manager.DrinkManager
import org.example.utils.createDrink
import org.example.utils.deleteDrink
import org.example.utils.getAllDrinks
import org.example.utils.makeDrink
import org.example.utils.updateDrink

fun main() {
    val manager = DrinkManager()

    while (true) {
        println("\nМеню:")
        println("1. Создать напиток")
        println("2. Показать напитки")
        println("3. Изменить напиток")
        println("4. Удалить напиток")
        println("5. Приготовить напиток")
        println("0. Выход")
        print("Выбор: ")

        when (readln()) {
            "1" -> {
                print("Введите имя напитка: ")
                val name = readln()
                val drink = createDrink(name)

                manager.create(drink)
                println("Напиток создан.")
            }

            "2" -> {
                getAllDrinks(manager)
            }

            "3" -> {
                if (manager.read().isEmpty()) {
                    println("Нет напитков!")
                    continue
                }
                updateDrink(manager)
            }

            "4" -> {
                if (manager.read().isEmpty()) {
                    println("Нет напитков!")
                    continue
                }
                deleteDrink(manager)
            }

            "5" -> {
                if (manager.read().isEmpty()) {
                    println("Нет напитков!")
                    continue
                }
                makeDrink(manager)
            }

            "0" -> {
                println("Выход.")
                break
            }

            else -> println("Неверный выбор!")
        }
    }
}

