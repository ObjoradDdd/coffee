package org.example.model

abstract class Action : Element {
    abstract override val name: String
    abstract fun doAction()
    open fun isAllowed(previousActions: List<Action>): Boolean = true
}