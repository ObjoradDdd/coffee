package org.example.model

abstract class Ingredient : Element {
    abstract override val name: String
    abstract val weight: Double
}