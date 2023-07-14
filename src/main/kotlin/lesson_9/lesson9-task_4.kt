package lesson_9

fun main() {

    val recipeIngredients = readln().split(",").map { it.trim() }.take(5).sorted()

    println(recipeIngredients)
}




