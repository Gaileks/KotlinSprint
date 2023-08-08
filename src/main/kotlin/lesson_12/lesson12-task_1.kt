package lesson_12

fun main() {
    val weatherOne = Weather2()
    weatherOne.weatherInfo()
    weatherOne.daytimeTemperature = 20
    weatherOne.nightTemperature = 15
    weatherOne.atmosphericPressure = 747
    weatherOne.wasItRaining = true
    weatherOne.weatherInfo()

    val weatherTwo = Weather2()
    weatherTwo.daytimeTemperature = 25
    weatherTwo.nightTemperature = 10
    weatherTwo.atmosphericPressure = 720
    weatherTwo.wasItRaining = false
    weatherTwo.weatherInfo()

}

class Weather2() {

    var daytimeTemperature: Int = 0
    var nightTemperature: Int = 0
    var atmosphericPressure: Int = 0
    var wasItRaining: Boolean = true

    fun weatherInfo() {
        println(
            """    
        daytimeTemperature       = $daytimeTemperature
        nightTemperature         = $nightTemperature
        atmosphericPressure      = $atmosphericPressure
        wasItRaining             = $wasItRaining
         _________________       
""".trimIndent()
        )
    }
}