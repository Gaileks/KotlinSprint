package lesson_8

fun main() {
    println("Сколько ингредиентов будет в рецепте:")

    val recipeIngredients = Array(readln().toInt()){
        println("Добавьте ${it + 1} ингредиент в рецепт: ")
        readln()
    }

    println("Список ингредиентов : ${recipeIngredients.joinToString(", ")}")
}