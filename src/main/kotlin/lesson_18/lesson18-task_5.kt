package lesson_18


fun main() {

    val string = Screen()

    string.draw(PointNew(x = 1, y = 1))
    string.draw(SquareNew(x = 1f, y = 1f))
    string.draw(CircleNew(x = 1, y = 1f))
}

open class Screen {

    fun draw(figure: Figure) {
        println("Нарисовали ${figure.name}, координаты X:${figure.x}, Y:${figure.y} ")
    }
}

abstract class Figure(
    open val name: String,
    open val x: Any,
    open val y: Any,
)


class PointNew(override val name: String = "Точка", override val x: Int, override val y: Int) : Figure(name, x, y)

class SquareNew(override val name: String = "Квадрат", override val x: Float, override val y: Float) :
    Figure(name, x, y)

class CircleNew(override val name: String = "Круг", override val x: Int, override val y: Float) : Figure(name, x, y)