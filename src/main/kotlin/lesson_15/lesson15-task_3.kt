package lesson_15

fun main() {

    val productFromMusicStore = listOf<ProductFromMusicStore>(
        MusicalInstruments("Скрипка", 5),
        MusicalInstruments("Гитара", 7),
        MusicalInstrumentAccessories("Струны", 50),
        MusicalInstrumentAccessories("Футляр", 15),
    )

    productFromMusicStore.forEach() {
        print(it.name)
        it.search()
        println("найдено: ${it.numberUnitsStock}")
    }


}

interface Search {

    fun search() {
        print(" Выполняется поиск ")
    }
}

abstract class ProductFromMusicStore(val name: String, val numberUnitsStock: Int) : Search

class MusicalInstruments(
    name: String,
    numberUnitsStock: Int
) : Search, ProductFromMusicStore(name, numberUnitsStock)

class MusicalInstrumentAccessories(
    name: String,
    numberUnitsStock: Int
) : Search, ProductFromMusicStore(name, numberUnitsStock)