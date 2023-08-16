package lesson_19

fun main() {

    val tank = Tank()
    tank.makeShot()
    tank.getWeaponNewType(Ammunition.BLUE)
    tank.makeShot()
    tank.getWeaponNewType(Ammunition.RED)
    tank.makeShot()
}

enum class Ammunition(val impactForce: Int) {
    BLUE(5),
    GREEN(10),
    RED(20),
}

class Tank(
    private var weapon: Ammunition? = null
) {

    fun getWeaponNewType(weapon: Ammunition) {
        println("Теперь танк заряжен снарядом ${weapon.name} ")
        this.weapon = weapon
    }

    fun makeShot() {

        if (weapon != null) {
            println("Танк произвел выстрел снарядом ${weapon?.name ?: "Выстрел холостым"} сила урона ${weapon?.impactForce ?: 0} ")
        } else {
            println("У танка патронов нет")
        }
    }
}
