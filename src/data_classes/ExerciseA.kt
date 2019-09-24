package data_classes

class ExerciseA {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

            val r1 = Recipe("Thai Curry", "Chicken")
            val r2 = Recipe("Thai Curry", "Chicken")
            val r3 = r1.copy(title = "Chicken Bhuna")

            println("r1 hash code: ${r1.hashCode()}")
            println("r2 hash code: ${r2.hashCode()}")
            println("r3 hash code: ${r3.hashCode()}")

            println("r1 toString: ${r1.toString()}")
            println("r2 toString: ${r2.toString()}")
            println("r3 toString: ${r3.toString()}")

            println("r1 == r2: ${r1 == r2}")
            println("r1 === r2: ${r1 === r2}")
            println("r1 == r3: ${r1 == r3}")

            // == checks for object equivalence.
            // === checks for object identity.

            val (title, mainIngredient, vegetarian, difficulty) = r1
            println("title is $title and vegetarian is $vegetarian")

            fun findRecipes(
                title: String = "",
                ingredient: String = "",
                isVegetarian: Boolean = false,
                difficulty: String = "") : Array<Recipe>{

                return arrayOf(Recipe(title, ingredient, isVegetarian, difficulty))
            }

            fun addNumbers(a: Int, b: Int) : Int{
                return a + b
            }

            fun addNumbers(a: Double, b: Double) : Double {
                return a + b
            }
        }
    }
}

data class Recipe(
    val title: String,
    val mainIngredient: String,
    val isVegetarian: Boolean = false,
    val difficulty: String = "Easy"
)

class Musshroom(val size: Int, val isMagic: Boolean) {
    constructor(isMagic_param: Boolean) : this(0, isMagic_param) {
        // code that runs when the secondary constructor is called
    }
}
