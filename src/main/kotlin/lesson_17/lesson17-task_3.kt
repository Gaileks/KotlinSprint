package lesson_17

fun main() {

    val folders = Folder(10, "Системные файлы ")

    println(folders.name + folders.numberOfFiles)
    folders.secret = false
    println(folders.name + folders.numberOfFiles)
}

class Folder(numberOfFiles: Int, name: String) {
    var secret: Boolean = true
    var name = name
        get() = when {
            secret -> "Скрытая папка "
            else -> field
        }
    var numberOfFiles = numberOfFiles
        get() = when {
            secret -> 0
            else -> field
        }
}



