package lesson_8

fun main() {
    println("Сколько ингредиентов будет в рецепте:")

    val recipeIngredients = arrayOfNulls<String>(readln().toInt())

    for (i in recipeIngredients.indices) {
        println("Добавьте ${i + 1} ингредиент в рецепт: ")
        recipeIngredients[i] = readln()
    }

    println("Список ингредиентов : ${recipeIngredients.joinToString(", ")}")
}