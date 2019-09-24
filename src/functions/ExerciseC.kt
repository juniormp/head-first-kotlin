package functions

class ExerciseC {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

            var x = 0
            var y = 20

            for(outer in 1..3){
                println("outer $outer")
                for(inner in 4 downTo 2){
                    println("inner $inner")
                    
                    y++
                    x =+ 3

                }
                y -= 2
            }
        }
    }
}