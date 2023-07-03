package lesson_4

fun main() {

    val day = 5
    val handsExercises = (day % 2) == 1
    val legsExercises = (day % 2) == 0
    val backsExercises = (day % 2) == 0
    val pressExercises = (day % 2) == 1

    println(
        """
    Упражнения для рук:    $handsExercises
    Упражнения для ног:    $legsExercises
    Упражнения для спины:  $backsExercises
    Упражнения для пресса: $pressExercises
""".trimIndent()
    )
}