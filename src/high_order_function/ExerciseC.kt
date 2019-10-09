package high_order_function

class ExerciseC {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

            val spentOnVegetables =
                groceries.filter { it.category == "Vegetable" }.sumByDouble { it.quantity * it.unitPrice }
            println("spentOnVegetables: $spentOnVegetables")

            val cheapItems = groceries.filter { (it.unitPrice * it.quantity) < 5.0 }.map { it.name }
            println("cheapItems: $cheapItems")

            groceries.groupBy { it.category }.forEach {
                println("${it.key}: ${it.value.sumByDouble { it.quantity * it.unitPrice }}")
            }

            groceries.filterNot { it.unit == "Bottle" }.groupBy { it.unit }.forEach {
                println(it.key)
                it.value.forEach { println("   ${it.name}")}
            }

        }
    }
}

val groceries = listOf(
    Grocery("Tomatoes", "Vegetable", "lb", 3.0, 3),

    Grocery("Mushrooms", "Vegetable", "lb", 4.0, 1),

    Grocery("Bagels", "Bakery", "Pack", 1.5, 2),

    Grocery("Olive oil", "Pantry", "Bottle", 6.0, 1),

    Grocery("Ice cream", "Frozen", "Pack", 3.0, 2)
)