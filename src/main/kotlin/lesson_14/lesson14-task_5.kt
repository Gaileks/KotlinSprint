package lesson_14

import kotlin.math.PI
import kotlin.math.pow
import kotlin.math.roundToInt
import kotlin.math.sqrt

const val RED = "красный"
const val BLACK = "черный"
const val GREEN = "зеленый"

fun main() {

    val figures = listOf(
        Circle(RED, 5.0),
        Circle(BLACK, 10.0),
        Triangle(RED, 4.0, 5.0, 3.0),
        Triangle(GREEN, 6.0, 8.0, 1.0),
        Rectangle(BLACK, 10.0, 3.0),
        Rectangle(RED, 8.0, 8.0),
    )

    println("Сумма периметров красных фигур: ${getSumPerimetersRedFigures(figures)}")
    println("Сумма площадей красных фигур: ${getSumAreasRedFigures(figures)}")
}

fun getSumPerimetersRedFigures(figures: List<Figure>): Double {
    var sumPerimeters = 0.0

    figures.filter { it.color == RED }.forEach() {
        sumPerimeters += it.getPerimeter()
    }
    return (sumPerimeters * 100).roundToInt() / 100.0
}

fun getSumAreasRedFigures(figures: List<Figure>): Double {
    var sumAreas = 0.0

    figures.filter { it.color == RED }.forEach() {
        sumAreas += it.getArea()
    }
    return (sumAreas * 100).roundToInt() / 100.0
}

abstract class Figure(val color: String) {

    abstract fun getArea(): Double

    abstract fun getPerimeter(): Double
}

class Circle(color: String, private val radius: Double) : Figure(color) {

    override fun getArea(): Double = (PI * radius.pow(2.0) * 100).roundToInt() / 100.0

    override fun getPerimeter(): Double = (2 * PI * radius * 100).roundToInt() / 100.0
}

class Rectangle(
    color: String,
    private val rectangleLength: Double,
    private val rectangleWidth: Double
) : Figure(color) {

    override fun getArea(): Double = rectangleLength * rectangleWidth

    override fun getPerimeter(): Double = 2 * (rectangleLength + rectangleWidth)
}

class Triangle(
    color: String,
    private val sideOne: Double,
    private val sideTwo: Double,
    private val sideThree: Double,
) : Figure(color) {

    override fun getArea(): Double {
        val halfMeter = (sideOne + sideTwo + sideThree) / 2
        val area = sqrt(halfMeter * ((halfMeter - sideOne) * (halfMeter - sideTwo) * (halfMeter - sideThree)))
        return (area * 100).roundToInt() / 100.0
    }

    override fun getPerimeter(): Double = (sideOne + sideTwo + sideThree)
}