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

    fun startPlaying() {
        println("Играет")
    }
}

interface Sleeping {

    fun startSleeping() {
        println("Спит")
    }
}

interface Eating {

    fun startEating() {
        println("Ест")
    }
}

open class Tamagotchi(val name: String) : Playing, Sleeping, Eating {

    override fun startEating() {
        print("$name ")
        super.startEating()
    }

    override fun startSleeping() {
        print("$name ")
        super.startSleeping()
    }

    override fun startPlaying() {
        print("$name ")
        super.startPlaying()
    }
}

class Fox(name: String) : Tamagotchi(name)

class Dog(name: String) : Tamagotchi(name)

class Cat(name: String) : Tamagotchi(name)