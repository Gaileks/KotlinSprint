package lesson_2

fun main() {
    val scoresOne = 3
    val scoresTwo = 4
    val scoresThree = 3
    val scoresFour = 5
    val averageScore: Double = (scoresOne + scoresTwo + scoresThree + scoresFour) / 4.0
    val roundoff = String.format("%.2f", averageScore)

    println(roundoff)
}
