package lesson_8

fun main() {
    val recipe = arrayOf("Молоко", "Яйца", "Мука", "Сахар", "Соль")
    val ingredient = readln().lowercase().capitalize()

    if (ingredient in recipe) {
        println("Ингредиент $ingredient. в рецепте есть")
    } else println("Такого ингредиента в рецепте нет")
}


