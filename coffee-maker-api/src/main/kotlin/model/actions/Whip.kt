package org.example.model.actions

import org.example.model.Action

class Whip : Action() {
    override val name = "Взбить"
    override fun doAction() {
        println("Взбито")
    }
}