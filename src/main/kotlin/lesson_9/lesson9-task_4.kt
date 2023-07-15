package lesson_9

fun main() {
    println("Введите ингредиенты рецепта (через запятую): ")
    val recipeIngredients = readln().split(",").map { it.trim() }.sorted()

    println(recipeIngredients)
}




