package lesson_8

fun main() {
    val recipeIngredients = arrayOf("молоко", "яйца", "мука", "сахар", "соль")
    val ingredient = readln().lowercase()

    if (ingredient in recipeIngredients) {
        println("Ингредиент $ingredient. в рецепте есть")
    } else println("Такого ингредиента в рецепте нет")
}


