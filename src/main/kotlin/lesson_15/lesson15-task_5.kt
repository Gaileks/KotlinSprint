package lesson_15

fun main() {

    val truck = Truck()
    val passengerCar = PassengerCar()
    val passengerCarTwo = PassengerCar()

    truck.vehicleMovement()
    truck.shipping()
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

    fun shipping() {
        println("Перевез 2 тонны груза")
    }
}

interface TransportationPeople {

    fun transportationPeople()
}

class PassengerCar : VehicleMovement, TransportationPeople {

    override fun transportationPeople() {
        println("Перевез 3 человека")
    }
}

class Truck : VehicleMovement, TransportationPeople, Shipping {

    override fun transportationPeople() {
        println("Перевез 1 человека")
    }
}