package abstract_classes_interfaces

abstract class Animal : Roamable {
    abstract val image: String
    abstract val food: String
    abstract val habitat: String
    var hunger: Int = 10

    abstract fun makeNoise()
    abstract fun eat()

    override fun roam() {
        println("The animal is roaming")
    }

    open fun sleep() {
        println("The animal is sleeping")
    }
}

abstract class Canine : Animal() {
    override fun roam() {
        println("The Canine is roaming")
    }
}

class Wolf : Canine() {
    override val image = "wolf.jpg"
    override val food = "meat"
    override val habitat = "forests"

    override fun makeNoise() {
        println("Hooooowl !")
    }

    override fun eat() {
        println("The wolf is eating $food")
    }
}

class Hippo : Animal() {

    override val image = "hippo.jpg"
    override val food = "grass"
    override val habitat = "water"

    override fun makeNoise() {
        println("Grunt! Grunt!")
    }

    override fun eat() {
        println("The Hippo is eating $food")
    }
}

interface Roamable {
    fun roam()
}

class Vehicle : Roamable {
    override fun roam() {
        println("The Vehicle is roaming")
    }

}

fun main(){

    val roamables = arrayOf(Hippo(), Wolf(), Vehicle())
    for (item in roamables){
        item.roam()
        if(item is Animal){
            item.eat()
        }
    }

}