package lesson_17

fun main() {}

class Quiz(question: String, answer: String) {

    var question = question
        set(value) {
            field = value
        }
    var answer = answer
        get() = field
        set(value) {
            field = value
        }
}
