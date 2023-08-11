package lesson_20

fun main() {

    val splashScreen = {username:String ->
        "С наступающим Новым Годом, ${username}!"
    }
// либо так
    val splashScreenNew = {
       println("Введите имя пользователя:")
       "С наступающим Новым Годом, ${readln()}!"
    }

    println(splashScreen("Андрей"))
    println(splashScreenNew())
}