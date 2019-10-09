package high_order_function

class HighOrderFunction {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val groceries = listOf(
                Grocery("Tomatoes", "Vegetable", "1b", 3.0, 3),
                Grocery("Mushrooms", "Vegetable", "1b", 4.0, 1),
                Grocery("Bagels", "Bakery", "Pack", 1.5, 2),
                Grocery("Olive oil", "Pantry", "Bottle", 6.0, 1),
                Grocery("Ice cream", "Frozen", "Pack", 3.0, 2)
            )

            val highestUnitPrice = groceries.maxBy { it.unitPrice }
            println("highestUnitPrice: $highestUnitPrice")

            val lowestQuantity = groceries.minBy { it.quantity }
            println("lowestQuantity: $lowestQuantity")

            val sumQuantity = groceries.sumBy { it.quantity }
            println("sumQuantity: $sumQuantity")

            val totalPrice = groceries.sumByDouble { it.quantity * it.unitPrice }
            println("totalPrice: $totalPrice")

            val vegetables = groceries.filter { it.category == "Vegetable" }
            println("vegetables: $vegetables")

            val unitPriceOver3 = groceries.filter { it.unitPrice > 3.0 }
            println("unitPriceOver3: $unitPriceOver3")

            val notFrozen = groceries.filterNot { it.category == "Frozen" }
            println("notFrozen: $notFrozen")

            val groceryNames = groceries.map { it.name }
            println("groceryNames: $groceryNames")

            val halfUnitPrice = groceries.map { it.unitPrice * 0.5 }
            println("halfUnitPrice: $halfUnitPrice")

            val newPrices = groceries
                .filter { it.unitPrice > 3.0 }
                .map { it.unitPrice * 2 }
            println("newPrices: $newPrices")

            groceries.forEach { println(it.name) }

            groceries
                .filter { it.unitPrice > 3.0 }
                .map { println(it.name) }

            var itemNames = ""
            groceries.forEach { itemNames += " ${it.name}" }
            println(itemNames)

            val groupByCategory = groceries.groupBy { it.category }
            println("groupByCategory: $groupByCategory")

            groceries.groupBy { it.category }.forEach{
                println("groupByCategory2: $it.key")
                it.value.forEach { println("       ${it.name}")}
            }


            val ints = listOf(1, 2, 3)

            val sumOfInts = ints.fold(0) { runningSum, item -> runningSum + item }

            ints.fold(1) { runningProduct, item -> runningProduct * item}

            groceries.fold("") { string, item -> string + " ${item.name}" }

            groceries.fold(50.0) { change, item -> change - (item.unitPrice * item.quantity)}

        }
    }
}

data class Grocery(
    val name: String, val category: String,
    val unit: String, val unitPrice: Double,
    val quantity: Int
)