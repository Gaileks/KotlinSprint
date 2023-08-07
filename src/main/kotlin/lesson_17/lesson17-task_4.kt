package lesson_17

fun main() {
    val thePackage = ThePackage("Москва", 12)

    thePackage.trackNumber = 24
    thePackage.location = "Питер"
    thePackage.location = "Лондон"
    thePackage.getInfoPackage()
}

class ThePackage(location: String, trackNumber: Int) {

    private var movementCounter = 0
    var trackNumber = trackNumber
        set(value) {}

    var location = location
        set(value) {
            field = value
            movementCounter++
        }

    fun getInfoPackage() {
        println(
            """
      location        = $location
      trackNumber     = $trackNumber
      movementCounter = $movementCounter        
    """.trimIndent()
        )
    }
}