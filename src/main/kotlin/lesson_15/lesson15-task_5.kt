package lesson_15

fun main() {

    val truck = Truck(5, 6)
    val passengerCar = PassengerCar(2)
    val passengerCarTwo = PassengerCar(10)

    truck.startVehicleMovement()
    truck.startShipping()
    truck.startTransportationPeople()
    passengerCar.startVehicleMovement()
    passengerCar.startTransportationPeople()
    passengerCarTwo.startVehicleMovement()
    passengerCarTwo.startTransportationPeople()
}

interface VehicleMovement {

    fun startVehicleMovement() {
        println("Автомобиль едет")
    }
}

interface Shipping {
    val numberOfCargo: Int
    val numberOfCargoMax: Int

    fun startShipping() {
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

    fun startTransportationPeople() {
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
    override val numberOfPassengers: Int,
    override val numberOfPassengersMax: Int = 3,
) : VehicleMovement, TransportationPeople

class Truck(
    override val numberOfPassengers: Int,
    override val numberOfCargo: Int,
    override val numberOfPassengersMax: Int = 1,
    override val numberOfCargoMax: Int = 2,
) : VehicleMovement, TransportationPeople, Shipping

