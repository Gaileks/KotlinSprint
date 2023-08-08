package lesson_18

fun main() {

    val cube = listOf(HexagonCube(), OctahedralCube(), FourSidedCube())

    cube.forEach() {
        it.rollTheDice()
    }
}

interface RollTheDice {

    fun rollTheDice()
}

class HexagonCube : RollTheDice {

    override fun rollTheDice() {
        println("На Шестигранном кубике выпало: ${(1..6).random()}")
    }
}

class OctahedralCube : RollTheDice {

    override fun rollTheDice() {
        println("На Восьмигранном кубике выпало: ${(1..8).random()}")
    }
}

class FourSidedCube : RollTheDice {

    override fun rollTheDice() {
        println("На Четырехгранном кубике выпало: ${(1..4).random()}")
    }
}