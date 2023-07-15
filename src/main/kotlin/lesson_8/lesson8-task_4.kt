package lesson_8

fun main() {
    val recipeIngredients = arrayOf("молоко", "яйца", "мука", "сахар", "соль")

    println("Список ингредиентов : ${recipeIngredients.joinToString(", ")}")
    println("Какой ингредиент  надо заменить:")

    val ingredient = readln().lowercase()

    if (ingredient !in recipeIngredients) {
        println("Такого ингредиента нет")
    } else {
        println("На какой ингредиент заменить:")
        recipeIngredients[recipeIngredients.indexOf(ingredient)] = readln()
        println("Новый список ингредиентов: ${recipeIngredients.joinToString(", ")}")
    }
}

