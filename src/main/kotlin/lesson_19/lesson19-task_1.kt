package lesson_19

fun main() {
    println("Добавить в свой аквариум можно следующих рыбок:")
    for (i in Fish.values()) println(i)
}

enum class Fish {
    GUPPY,
    ANGELFISH,
    GOLDFISH,
    SIAMESE_FIGHTING_FISH,
}