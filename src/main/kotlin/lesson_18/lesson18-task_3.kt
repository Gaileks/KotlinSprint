package lesson_18

fun main() {

    val tamagotchi = listOf(Fox("Хитрюга"), Dog("Боб"), Cat("Шустрик"))

    tamagotchi.forEach() {
        it.startEating()
        it.startPlaying()
        it.startSleeping()
    }
}

interface Playing {
    val name: String

    fun startPlaying() {
        println("$name Играет")
    }
}

interface Sleeping {
    val name: String

    fun startSleeping() {
        println("$name Спит")
    }
}

interface Eating {
    val name: String

    fun startEating() {
        println("$name Ест")
    }
}

abstract class Tamagotchi : Playing, Sleeping, Eating

class Fox(override val name: String) : Tamagotchi()

class Dog(override val name: String) : Tamagotchi()

class Cat(override val name: String) : Tamagotchi()