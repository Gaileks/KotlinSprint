package lesson_8


fun main() {
    val recipe = arrayOf("Молоко", "Яйца", "Мука", "Сахар", "Соль")
    val ingredient = readln()

    for (i in recipe.indices) {
        if (recipe[i].lowercase() == ingredient.lowercase()) {
            println("Ингредиент ${recipe[i]} в рецепте есть")
            return
        }
    }
    println("Такого ингредиента в рецепте нет")
}