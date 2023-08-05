package lesson_15

fun main() {
    Duck().move()
    Seagull().move()
    CrucialCarp().move()
}

interface Swimming {

    fun move() {
        println("Плавает")
    }
}

interface Flying {

    fun move() {
        println("Летит")
    }
}

class Duck : Swimming
class Seagull : Flying
class CrucialCarp : Swimming
