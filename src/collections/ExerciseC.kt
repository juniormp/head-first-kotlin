package collections

class ExerciseC {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

            val a = "Sue"
            val b = a

            val set = setOf(a, b)

            println(set)

            val a2 = Recipe("Thai Curry")
            val b2 = Recipe("Thai Curry")

            val set2 = setOf(a2, b2)

            println(set2)
        }
    }
}

data class Recipe(val ingredient: String)