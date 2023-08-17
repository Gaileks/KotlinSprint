package lesson_18


fun main() {

    val string = Screen()

    string.draw(PointNew(), 1, 1)
    string.draw(SquareNew(), 2f, 2f)
    string.draw(CircleNew(), 3, 3f)
    string.draw(CircleNew(), 4f, 4)

}

class Screen {

    fun draw(figure: Figure, x: Float, y: Int) {
        println("Фигура ${figure.name} нарисована в координатах $x и $y")
    }

    fun draw(figure: Figure, x: Int, y: Int) {
        println("Фигура ${figure.name} нарисована в координатах $x и $y")
    }

    fun draw(figure: Figure, x: Int, y: Float) {
        println("Фигура ${figure.name} нарисована в координатах $x и $y")
    }

    fun draw(figure: Figure, x: Float, y: Float) {
        println("Фигура ${figure.name} нарисована в координатах $x и $y")
    }
}

abstract class Figure(open val name: String)

class PointNew(override val name: String = "Точка") : Figure(name)

class SquareNew(override val name: String = "Квадрат") : Figure(name)

class CircleNew(override val name: String = "Круг") : Figure(name)