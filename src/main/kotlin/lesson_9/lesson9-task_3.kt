package lesson_9

fun main() {
    val recipeIngredients = listOf(2, 50, 15)

    println("Введите количество порций:")

    val numberServings = readln().toInt()
    val recipeIngredientsTwo = recipeIngredients.map { it * numberServings }

    println("На $numberServings порций вам понадобится:")
    println(" Яиц – ${recipeIngredientsTwo[0]} шт., молока – ${recipeIngredientsTwo[1]} мл., сливочного масла – ${recipeIngredientsTwo[2]} гр.")
}