package lesson_11

fun main() {
    val userOne = User("Миша", "https://1")
    val userTwo = User("Саша", "https://2")
    val userThree = User("Оля", "https://4")
    val userFour = User("Лена", "https://5")
    val userFive = User("Катя", "https://6")
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
    private var userIsDisabled: Boolean = false,
    private var talkingNow: Boolean = !userIsDisabled,
    private var microphoneIsWorking: Boolean = !userIsDisabled,

    ) {

    fun getInfo() {
        println(
            """
    name                = $name
    avatar              = $avatar
    userIsDisabled      = $userIsDisabled
    talkingNow          = $talkingNow
    microphoneIsWorking = $microphoneIsWorking
    _________________          
      """.trimIndent()
        )
    }
}