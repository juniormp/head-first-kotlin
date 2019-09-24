package functions

class ExerciseB {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            doSomenthing("do something", 4)
            timesThree(3)
            maxValue(arrayOf(2, 2, 2))

            for (x in 1..100 step 2) println(x)
        }

        fun doSomenthing(msg: String, i: Int): Unit {
            if (i > 0) {
                var x = 0

                while (x < i) {
                    println(msg)
                    x += 1
                }
            }
        }

        fun timesThree(x: Int): Int {
            return x * 3
        }

        fun maxValue(args: Array<Int>) : Int {
            var max = args[0]
            var x = 1

            while (x < args.size){
                var item = args[x]
                max = if (max >= item) max else item

                x *= x + 1
            }

            return max
        }
    }
}