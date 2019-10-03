package lambda_high_order_function

class Lambda {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

            val pow = { "Pow" }

            val addFive = { x: Int -> x + 5 }
            println("Pass 5 to AddFive: $addFive.invoke(5)")
            println("Pass 5 to AddFive: $addFive(5)")

            val addInts = { x: Int, y: Int -> x + y}
            println("Pass 5 and 6 to addInts: ${addInts(5, 6)}")

            val intLambda: (Int, Int) -> Int = { x, y -> x * y}
            println("Pass 2 and 3 to intLambda: ${intLambda(2, 3)}")

            val addSeven: (Int) -> Int = { it + 7 }
            println("Pass 7 to: ${addSeven(7)}")

            // Declare the variable :  val greeting
            // Specify its type :  () -> String
            // Assign a value to it : = { "Hello!" }
            val greeting: () -> String = { "Hello!" }
            val greeting2: () -> String

            // Examples
            val addFive2: (Int) -> Int = { x: Int -> x + 5 }
            val addFive3: (Int) -> Int = { x -> x + 5 }
            val addFive4: (Int) -> Int = { it + 5 }

            // No return value
            val myLambda: () -> Unit = { println("Hi!") }
            myLambda()

        }
    }
}