package lesson_11

fun main() {

    val userOne = User("Миша", "https://1", "разговаривает")
    val userTwo = User("Саша", "https://2", "разговаривает")
    val userThree = User("Оля", "https://4", "разговаривает")
    val userFour = User("Лена", "https://5", "разговаривает")
    val userFive = User("Катя", "https://6", "разговаривает")
    val roomOne = Room(
        "Беседа 1", "https://21",
        mutableListOf(userOne, userTwo, userThree)
    )
    val roomTwo = Room(
        "Беседа 2", "https://22",
        mutableListOf(userOne, userTwo, userThree, userFive, userFour)
    )

    roomOne.infoListOfUsers()
    roomTwo.infoListOfUsers()
}

class Room(
    private val name: String,
    private val cover: String,
    private var listOfUsers: MutableList<User>
) {

    fun infoListOfUsers() {
        println("Состав участников комнаты $name: ")
        listOfUsers.forEach() {
            print("${it.name}, ")
        }
        println()
    }
}

class User(
    val name: String,
    private val avatar: String,
    private var status: String,
    private var userIsDisabled: Boolean = false,
    private var talkingNow: Boolean = !userIsDisabled,
    private var microphoneIsWorking: Boolean = !userIsDisabled,
) {

    fun longClick() {
        println("Иконка подсветилась")
    }

    fun setStatus(statusNumber: Int) {
        when (statusNumber) {
            1 -> status = "разговаривает"
            2 -> status = "микрофон выключен"
            3 -> status = "пользователь заглушен"
        }
    }

    fun getInfo() {
        println(
            """
    name                = $name
    avatar              = $avatar
    status              = $status
    userIsDisabled      = $userIsDisabled
    talkingNow          = $talkingNow
    microphoneIsWorking = $microphoneIsWorking
    _________________          
      """.trimIndent()
        )
    }
}