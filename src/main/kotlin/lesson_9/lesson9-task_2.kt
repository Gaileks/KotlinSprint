package lesson_9

fun main() {
    val recipeIngredients = mutableListOf("молоко", "яйца", "мука")

    println("В рецепте есть базовые ингредиенты: ${recipeIngredients.joinToString(", ")}")
    println("Желаете добавить еще?")

    if (readln().lowercase() == "да") {
        println("Какой ингредиент вы хотите добавить?")
        recipeIngredients.add(readln())
        println("Теперь в рецепте есть следующие ингредиенты: ${recipeIngredients.joinToString(", ")}")
    }
}