package lambda_high_order_function

class HighOrderFunctionB {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

            val kgsToPounds = { x: Double -> x * 2.204623 }
            val poundsToUSTons = { x: Double -> x / 2000.0}

            val kgsToUSTons = combine(kgsToPounds, poundsToUSTons)
            val usTons = kgsToUSTons(1000.0)

        }

        fun combine(lambda1: (Double) -> Double,
                    lambda2: (Double) -> Double): (Double) -> Double {

            return { x: Double -> lambda2(lambda1(x)) }
        }

        /**

        //type alias

        typealias DoubleConversion = (Double) -> Double

        fun combine2(lambda1: DoubleConversion,
                    lambda2: DoubleConversion): DoubleConversion {

            return { x: Double -> lambda2(lambda1(x)) }
        }

        **/
    }
}