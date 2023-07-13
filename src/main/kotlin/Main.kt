fun main(args: Array<String>) {
    println("Hello World!")
    println("Hello World!".cyan())
}
fun String.cyan() = "\u001b[36m${this}\u001b[0m"
fun String.white() = "\u001b[60m${this}\u001b[0m"
fun String.black() = "\u001b[30m${this}\u001b[0m"
fun String.bgWhite() = "\u001b[40m${this}\u001b[0m"
fun String.brightWhite() = "\u001b[31;1m${this}\u001b[0m"
fun String.bold() = "\u001b[1m${this}\u001b[0m"