package org.example.utils

import org.example.model.Drink
import org.example.model.actions.Add
import org.example.model.actions.Boil
import org.example.model.actions.Grind
import org.example.model.actions.Mix
import org.example.model.actions.Pour
import org.example.model.actions.Whip

fun createDrink(name: String = ""): Drink {
    val drink = Drink(name)

    while (true) {
        print("Добавить действие (add/grind/boil/mix/pour/whip) или `готово` для завершения: ")
        val act = readln()
        if (act == "готово") break

        when (act) {
            "add" -> {
                val ing = addIngredient()
                if (ing != null) drink.addAction(Add(ing, drink))
            }

            "grind" -> drink.addAction(Grind())
            "boil" -> drink.addAction(Boil())
            "mix" -> drink.addAction(Mix())
            "pour" -> drink.addAction(Pour())
            "whip" -> drink.addAction(Whip())
            else -> println("Неизвестное действие.")
        }
    }

    return drink
}