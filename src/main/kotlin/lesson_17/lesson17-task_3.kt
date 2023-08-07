package lesson_17

fun main() {

    val folders = Folders()

    println(folders.name + folders.numberOfFiles)
    folders.secret = false
    println(folders.name + folders.numberOfFiles)
}

class Folders {
    var secret: Boolean = true
    var name: String = "Системные файлы "
        get() {
            return if (secret) {
                "Скрытая папка "
            } else field
        }
    var numberOfFiles: Int = 10
        get() {
            return if (secret) {
                0
            } else field
        }
}



