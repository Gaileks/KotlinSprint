package lesson_18

import kotlin.math.pow

fun main() {

    listOf(
        RectangularBox(5, 4, 2),
        CubicBox(6)
    ).map { it.getParcelSurfaceArea() }
}

interface ParcelSurfaceArea {
    fun getParcelSurfaceArea(): Int
}

class RectangularBox(
    private val length: Int,
    private val width: Int,
    private val height: Int,
) : ParcelSurfaceArea {

    override fun getParcelSurfaceArea(): Int {
        val area = (length * width + width * height + length * height) * 2
        println("Площадь поверхности прямоугольной посылки = $area")
        return area
    }
}

class CubicBox(
    private val cubeEdgeLength: Int,
) : ParcelSurfaceArea {

    override fun getParcelSurfaceArea(): Int {
        val area = (cubeEdgeLength.toDouble().pow(2.0) * 6).toInt()
        println("Площадь поверхности кубической посылки = $area")
        return area
    }
}