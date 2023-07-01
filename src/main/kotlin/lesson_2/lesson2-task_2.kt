package lesson_2

fun main() {
    val worker = 50
    println(worker)
    val workerPay = 30000
    println(workerPay)
    val workerPayTotal = worker * workerPay
    println(workerPayTotal)
    val intern = 30
    println(intern)
    val internPay = 20000
    println(internPay)
    val internPayTotal = intern * internPay
    println(internPayTotal)
    val payTotal = workerPayTotal + internPayTotal
    println(payTotal)
    val averageSalary = payTotal / (worker + intern)
    println(averageSalary)
}