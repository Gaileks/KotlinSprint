package lesson_2

fun main() {
    val departureHour = 9
    val departureMinutes = 39
    val minutesWay = 457
    val arrivalTimeHour = (departureHour * 60 + departureMinutes + minutesWay) / 60
    val arrivalTimeMinutes = (departureHour * 60 + departureMinutes + minutesWay) % 60
    println("Время прибытия поезда $arrivalTimeHour:$arrivalTimeMinutes")
}
