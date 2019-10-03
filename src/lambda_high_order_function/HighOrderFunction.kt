package lambda_high_order_function

class HighOrderFunction {

    /** A function that uses a lambda as a parameter or return
    value is known as a higher-order function. **/

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

            val fahrenheit  = convert(20.0, { c: Double -> c * 1.8 + 32})
            val convertedFive = convertFive { it * 1.8 + 32 }

            val pounds = getConversionLambda("PoundsToUSTons")(2.5)
            println(pounds)
        }

        fun convert(x: Double, converter: (Double) -> Double): Double {
            val result = converter(x)
            println("$x is converted to $result")

            return result
        }

        fun convertFive(converter: (Int) -> Double) : Double {
            val result = converter(5)
            println("5 is converted to $result")

            return result
        }

        fun getConversionLambda(str: String): (Double) -> Double {
            if (str == "CentigradeToFahrenheit"){
                return { it * 1.8 + 32}
            } else if ( str == "PoundsToUSTons"){
                return { it / 2000.0 }
            } else {
                return { it }
            }
        }
    }
}