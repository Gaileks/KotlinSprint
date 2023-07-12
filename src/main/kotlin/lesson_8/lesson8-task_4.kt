package lesson_8

fun main() {
    val recipe = arrayOf("Молоко", "Яйца", "Мука", "Сахар", "Соль")

    println("Список ингредиентов : ${recipe.joinToString(", ")}")
    println("Какой ингредиент  надо заменить:")

    val ingredient = readln()

    if (ingredient !in recipe) println("Такого ингредиента нет")
    else {
        println("На какой ингредиент заменить:")

        for (i in recipe.indices) {
            if (recipe[i] == ingredient) {
                recipe[i] = readln()
                println("Новый список ингредиентов: ${recipe.joinToString(", ")}")
            }
        }
    }
}