package lesson_9

import java.util.*

fun main() {
    println("В рецепт надо добавить пять ингредиентов")

    var recipeIngredients = mutableListOf<String>()

    repeat(5) {
        println("Добавите ${it + 1} ингредиент: ")
        recipeIngredients.add(readln())
    }

    recipeIngredients = recipeIngredients.toSet().toMutableList()
    recipeIngredients.sort()
    recipeIngredients[0] = recipeIngredients[0].capitalizeNew()

    println("${recipeIngredients.joinToString(", ")}.")
}

fun String.capitalizeNew(): String =
    replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }