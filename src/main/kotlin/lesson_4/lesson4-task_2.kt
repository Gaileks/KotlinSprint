package lesson_4

fun main() {
    var weight = 20
    var volume = 80

    println("Average для груза с весом $weight кг и объемом $volume " +
            "л: ${(weight >= 35 && weight <= 100) && (volume <= 100)}")

    weight = 50
    volume = 100

    println("Average для груза с весом $weight кг и объемом $volume " +
            "л: ${(weight >= 35 && weight <= 100) && (volume <= 100)}")
}