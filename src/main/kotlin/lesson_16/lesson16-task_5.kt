package lesson_16

fun main() {

    val gamer = Gamer("Max",50)

    gamer.statusGamerInfo()
    gamer.causeDamage(90)
    gamer.statusGamerInfo()
    gamer.healing(500)
    gamer.statusGamerInfo()
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
        when {
            !isAlive -> death()
            (health + mana) >= 100 -> health = 100
            else -> health += mana
        }
    }

    fun causeDamage(mana: Int) {
        when {
            !isAlive -> death()
            (health - mana) <= 0 -> death()
            else -> health -= mana
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
