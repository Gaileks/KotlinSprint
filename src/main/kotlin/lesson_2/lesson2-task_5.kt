package lesson_2

import kotlin.math.pow

fun main() {
    val money = 70_000.0
    val interestRate = 16.7
    val years = 20.0
    var money2 = money * (1 + interestRate / 100.00).pow(years)
    money2 = ((money2 * 1000).toInt() / 1000.0)  //println( String.format("%.3f", money) )
    println(money2)
}