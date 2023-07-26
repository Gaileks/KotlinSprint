package lesson_9

import java.util.*

fun main() {
    println("В рецепт надо добавить пять ингредиентов")

    val recipeIngredients = mutableSetOf<String>()

    repeat(5) {
        println("Добавите ${it + 1} ингредиент: ")
        recipeIngredients.add(readln())
    }
    println("${recipeIngredients.sorted().joinToString(", ").capitalizeNew()}.")
}

fun String.capitalizeNew(): String =
    replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }