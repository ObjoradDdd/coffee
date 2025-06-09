package org.example.model.actions

import org.example.model.Action

class Mix : Action() {
    override val name = "Перемешать"
    override fun doAction() {
        println("Перемешано")
    }
}