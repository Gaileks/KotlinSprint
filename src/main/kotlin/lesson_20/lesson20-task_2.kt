package lesson_20

fun main() {
    val youngPlayer = YoungPlayer("Yakov",50,100)

    youngPlayer.startTreatment(60)
}

class YoungPlayer(
    private  var name: String,
    private var health: Int,
    private var maximumHealth: Int,
) {
    var startTreatment = { mana: Int ->
        if (health + mana > maximumHealth) {
            health = maximumHealth
        } else {
            health += mana
        }
       println("К игроку $name было применено лечение на $mana, теперь его здоровее составляет $health")
    }
}