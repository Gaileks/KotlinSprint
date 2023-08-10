package lesson_19

fun main() {

    OnlineStoreCargo(1,"Рубашка",OnlineStoreCategories.CLOTHING).getOnlineStoreCargoInfo()
    OnlineStoreCargo(2,"Бумага",OnlineStoreCategories.OFFICE_SUPPLIES).getOnlineStoreCargoInfo()
}

fun getTitleCategory(categoryOfCargo: OnlineStoreCategories): String {

    return when(categoryOfCargo){
        OnlineStoreCategories.CLOTHING -> "Одежда"
        OnlineStoreCategories.OFFICE_SUPPLIES -> "Канцелярские товары"
        OnlineStoreCategories.DIFFERENT_PRODUCTS -> "Разные товары"
    }
}


enum class OnlineStoreCategories() {
    CLOTHING,
    OFFICE_SUPPLIES,
    DIFFERENT_PRODUCTS,
}

class OnlineStoreCargo(
    private val id: Int,
    private val name: String,
    private val category: OnlineStoreCategories
) {

    fun getOnlineStoreCargoInfo() {
        println(
            """
        id:        $id
        Название:  $name        
        категория: ${getTitleCategory(category)}   
                    
    """.trimIndent()
        )
    }
}
