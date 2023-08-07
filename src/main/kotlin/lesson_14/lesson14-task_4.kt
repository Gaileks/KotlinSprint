package lesson_14

fun main() {

    val planet = Planet(
        "Марс",
        landingCapability = true,
        satellites = listOf(
            Satellite("Фобос", landingCapability = true),
            Satellite("Деймос", landingCapability = true)
        )
    )

    println(planet.name)
    planet.getSatellitesNames()
}

open class AstronomicalObject(
    val name: String,
    val inhabited: Boolean,
    val availabilityAtmosphere: Boolean,
    val availabilityWater: Boolean,
    val landingCapability: Boolean,
)

class Planet(
    name: String,
    inhabited: Boolean = true,
    availabilityAtmosphere: Boolean = true,
    availabilityWater: Boolean = true,
    landingCapability: Boolean,
    val satellites: List<Satellite>

) : AstronomicalObject(
    name,
    inhabited,
    availabilityAtmosphere,
    availabilityWater,
    landingCapability
) {
    fun getSatellitesNames() {
        satellites.forEach() {
            println(it.name)
        }
    }
}

class Satellite(
    name: String,
    inhabited: Boolean = false,
    availabilityAtmosphere: Boolean = false,
    availabilityWater: Boolean = false,
    landingCapability: Boolean,

    ) : AstronomicalObject(
    name,
    inhabited,
    availabilityAtmosphere,
    availabilityWater,
    landingCapability
)