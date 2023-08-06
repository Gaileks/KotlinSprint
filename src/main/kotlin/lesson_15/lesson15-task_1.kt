package lesson_15

fun main() {
    Duck().swim()
    Duck().walk()
    Duck().fly()
    Seagull().fly()
    Seagull().walk()
    CrucialCarp().swim()
}

interface Swimming {

    fun swim() {
        println("Плавает")
    }
}

interface Walking {

    fun walk() {
        println("Идет")
    }
}

interface Flying {

    fun fly() {
        println("Летит")
    }
}

class Duck : Swimming, Walking, Flying
class Seagull : Flying, Walking
class CrucialCarp : Swimming
