package lesson_2

fun main() {
    var money = 70_000.0
    val interestRate = 16.7
    val years = 20
    repeat(years) {
        money += money / 100 * interestRate
    }
    money = ((money * 1000).toInt() / 1000.0)  //println( String.format("%.3f", money) )
    println(money)

}