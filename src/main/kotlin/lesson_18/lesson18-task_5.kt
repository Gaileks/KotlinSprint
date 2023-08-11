package lesson_18


fun main() {

    val string = Screen()

    string.draw(1, 2, PointNew())
    string.draw(1f, 2f, SquareNew())
    string.draw(1, 2f, CircleNew())
}

open class Screen {

    fun draw(x: Int, y: Int, pointNew: PointNew) {
        println("Нарисовали ${pointNew.name}, координаты X:$x, Y:$y ")
    }

    fun draw(x: Float, y: Float, squareNew: SquareNew) {
        println("Нарисовали ${squareNew.name}, координаты X:$x, Y:$y ")
    }

    fun draw(x: Int, y: Float, circleNew: CircleNew) {
        println("Нарисовали ${circleNew.name}, координаты X:$x, Y:$y ")
    }
}

class PointNew(val name: String = "Точка") : Screen()

class SquareNew(val name: String = "Квадрат") : Screen()

class CircleNew(val name: String = "Круг") : Screen()