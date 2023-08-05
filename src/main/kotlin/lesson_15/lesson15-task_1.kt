package lesson_15

fun main() {
    Duck().move()
    Seagull().move()
    CrucialCarp().move()
}

interface DuckMovement {

    fun move() {
        println("Утка идет")
    }
}

interface SeagullMovement {

    fun move() {
        println("Чайка летит")
    }
}

interface CrucialCarpMovement {

    fun move() {
        println("Карась плывет")
    }
}

class Duck : DuckMovement
class Seagull : SeagullMovement
class CrucialCarp : CrucialCarpMovement
