package lesson_15


fun main() {
    val temperature = Temperature(25.0)
    val precipitationAmount = PrecipitationAmount(0.5)

    temperature.sendMessage()
    precipitationAmount.sendMessage()
}

abstract class WeatherStationMain(message: Double) {

    fun connectToTheServer() {
        println("К серверу подключились")
    }

    abstract fun sendMessage()
}

class Temperature(private var message: Double) : WeatherStationMain(message) {

    override fun sendMessage() {
        super.connectToTheServer()
        println("Температура: $message \nСобщение:Отправлено")
    }
}

class PrecipitationAmount(private var message: Double) : WeatherStationMain(message) {

    override fun sendMessage() {
        super.connectToTheServer()
        println("Осадки составили:$message \nСобщение:Отправлено")
    }
}
