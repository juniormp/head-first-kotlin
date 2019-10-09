package high_order_function

class ExerciseA {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val ints = listOf(1, 2, 3, 4, 5)

            val pizzas = listOf(
                Pizza("Sunny Chicken", 4.5, 4),
                Pizza("Tropical", 3.0, 2),
                Pizza("The Garden", 3.5, 3)
            )

            val minInt = ints.minBy { it }
            println("minInt: $minInt")

            val minInt2 = ints.minBy { int: Int -> int}
            println("minInt2: $minInt2")

            val sumInts = ints.sum()
            println("sumInts: $sumInts")

            val sumInts3 = ints.sumBy { number: Int -> number }
            println("sumInts3: $sumInts3")

            val sumInts33 = ints.sumByDouble { it.toDouble() }

            val sumInts4 = ints.sumByDouble { int: Int -> int.toDouble() }
            println("sumInts4: $sumInts4")


            val lowPrice = pizzas.minBy { it.pricePerSlice }

            val lowPrice2 = pizzas.maxBy { it.pricePerSlice }

            val highQuantity = pizzas.maxBy { p: Pizza -> p.quantity }

            val highQuantity2 = pizzas.maxBy { it.quantity }

            val totalPrice = pizzas.sumByDouble { it.pricePerSlice * it.quantity }
        }
    }
}

data class Pizza(val name: String, val pricePerSlice: Double, val quantity: Int)