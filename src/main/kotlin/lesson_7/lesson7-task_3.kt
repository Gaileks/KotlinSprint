fun main() {
    println("Введите число: ")
    val num = readln().toInt()
    for (i in 0..num step 2) println(i)
}