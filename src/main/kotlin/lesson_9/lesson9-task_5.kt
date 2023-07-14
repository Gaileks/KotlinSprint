package lesson_9

fun main() {
    println("В рецепт надо добавить пять ингредиентов")

    var recipeIngredients = mutableListOf<String>()

    repeat(5) {
        println("Добавите ${it + 1} ингредиент: ")
        recipeIngredients.add(readln())
    }

    recipeIngredients = recipeIngredients.distinct().toMutableList()
    recipeIngredients.sort()
    recipeIngredients[0] = recipeIngredients[0].capitalize()

    println("${recipeIngredients.joinToString(", ")}.")
}