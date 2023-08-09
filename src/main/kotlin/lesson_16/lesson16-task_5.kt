package lesson_16

fun main() {

    val gamer = Gamer("Max", 50)

    gamer.statusGamerInfo()
    gamer.causeDamage(90)
    gamer.healing(500)
    gamer.causeDamage(110)
    gamer.statusGamerInfo()
}

class Gamer(
    private val name: String,
    private var impactForce: Int,
) {
    private var health: Int = 100
    private var isAlive: Boolean = true

    private fun death() {
        println("Игрок мертв\n")
        impactForce = 0
        health = 0
        isAlive = false
    }

    fun healing(mana: Int) {

        if (!isAlive) {
            println("Игрок уже мертв, его нельзя лечить!")
            return
        }
        println("К игроку применили лечение на $mana маны")
        when {
            (health + mana) >= 100 -> health = 100
            else -> health += mana
        }
        println("Текущее здоровье: $health%")
    }

    fun causeDamage(mana: Int) {
        if (!isAlive) {
            println("Игрок уже мертв, его нельзя повторно убить!")
            return
        }
        println("Игроку нанесли урон $mana")
        when {
            (health - mana) <= 0 -> death()
            else -> {
                health -= mana
                println("Текущее здоровье: $health%")
            }
        }
    }

    fun statusGamerInfo() {
        println(
            """           
           Имя:        $name  
           Жизнь:      $health%
           Сила удара: $impactForce
           Живой ли?:  ${
                if (isAlive) {
                    "да"
                } else {
                    "нет"
                }
            }  
                  
       """.trimIndent()
        )
    }
}
