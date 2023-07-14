package lesson_9

fun main() {
    val recipeIngredients = listOf("молоко", "яйца", "мука", "сахар", "соль")

    println("В рецепте есть следующие ингредиенты:")

    recipeIngredients.forEach() { println("$it ") }
}