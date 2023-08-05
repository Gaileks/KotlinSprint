package lesson_16

import kotlin.math.pow
import kotlin.math.roundToInt

const val PI = 3.14

fun main() {

    println(Circle().getCircumferenceLength())
    println(Circle().getAreaCircle())
}

class Circle(private val radius: Double = 4.0) {

    fun getAreaCircle(): Double = (PI * radius.pow(2.0) * 100).roundToInt() / 100.0

    fun getCircumferenceLength(): Double = (2 * PI * radius * 100).roundToInt() / 100.0
}