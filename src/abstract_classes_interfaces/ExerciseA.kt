package abstract_classes_interfaces

class ExerciseA {

}

abstract class Appliance {
    val pluggedIn = true
    abstract val color: String

    abstract fun consumePower()
}

final class CoffeeMaker(): Appliance() {
    final override val color = "Red"
    val coffeeLeft = false

    override fun consumePower() {
        println("Consuming Power")
    }

    fun fillWithWater(){
        println("Fill with water")
    }

    fun makeCoffee(){
        println("Make the coffee")
    }
}