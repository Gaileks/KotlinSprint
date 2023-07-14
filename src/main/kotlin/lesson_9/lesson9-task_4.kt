package lesson_9

fun main() {
    println("Введите ингредиенты рецепта (через запятую): ")
    val recipeIngredients = readln().split(",").map { it.trim() }.take(5).sorted()

    println(recipeIngredients)
}




