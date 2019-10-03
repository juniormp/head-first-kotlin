package generics

class ExerciseD {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

            var foodSeller: Seller<Food>
            foodSeller = FoodSeller()
            foodSeller = VeganFoodSeller()

            var veganFoodConsumer: Consumer<VeganFood>
            veganFoodConsumer = Vegan()
            veganFoodConsumer = Person()

        }
    }
}

//Food
open class Food

class VeganFood : Food()

// Sellers
interface Seller<out T>

class FoodSeller : Seller<Food>
class VeganFoodSeller : Seller<VeganFood>

// Consumers
interface Consumer<in T>
class Person : Consumer<Food>
class Vegan : Consumer<VeganFood>


/**
A generic type is invariant if it can only accept references of that specific type. Generic types are invariant by default.
A generic type is covariant if you can use a subtype in place of a supertype. You specify that a type is covariant by prefixing it with out.
A generic type is contravariant if you can use a supertype in place of a subtype. You specify that a type is contravariant by prefixing it with in.
 **/