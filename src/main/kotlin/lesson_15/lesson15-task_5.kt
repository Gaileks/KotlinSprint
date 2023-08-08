package lesson_15

fun main() {

    val truck = Truck(5,6)
    val passengerCar = PassengerCar(2)
    val passengerCarTwo = PassengerCar(10)

    truck.vehicleMovement()
    truck.shipping()
    truck.transportationPeople()
    passengerCar.vehicleMovement()
    passengerCar.transportationPeople()
    passengerCarTwo.vehicleMovement()
    passengerCarTwo.transportationPeople()
}

interface VehicleMovement {

    fun vehicleMovement() {
        println("Автомобиль едет")
    }
}

interface Shipping {
    val numberOfCargo: Int
    val numberOfCargoMax: Int

    fun shipping() {
        when {
            numberOfCargo > numberOfCargoMax -> {
                println("Максимально автомобиль может перевезти $numberOfCargoMax тонн груза")
                println("Автомобиль перевез $numberOfCargoMax тонн груза")
            }
            else -> println("Автомобиль перевез $numberOfCargo тонн груза")
        }
    }
}

interface TransportationPeople {
    val numberOfPassengers: Int
    val numberOfPassengersMax: Int

    fun transportationPeople() {
        when {
            numberOfPassengers > numberOfPassengersMax -> {
                println("Максимально автомобиль может перевезти $numberOfPassengersMax человека")
                println("Автомобиль перевез $numberOfPassengersMax человека")
            }
            else -> println("Автомобиль перевез $numberOfPassengers человека")
        }
    }
}

class PassengerCar(
    override val numberOfPassengers: Int
) : VehicleMovement, TransportationPeople {
    override val numberOfPassengersMax: Int = 3
}

class Truck(
    override val numberOfPassengers: Int,
    override val numberOfCargo: Int,
) : VehicleMovement, TransportationPeople, Shipping {
    override val numberOfPassengersMax = 1
    override val numberOfCargoMax = 2
}
