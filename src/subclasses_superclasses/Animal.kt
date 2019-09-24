package subclasses_superclasses

open class Animal() {
    open val image: String = ""
    open val food: String = ""
    open val habitat: String = ""
    var hunger: Int = 10

    open fun makeNoise(){
        println("The animal is making noise")
    }

    open fun eat(){
        println("The animal is eating")
    }

    open fun roam() {
        println("The animal is roaming")
    }

    open fun sleep() {
        println("The animal is sleeping")
    }
}

open class Canine: Animal(){
    override fun roam() {
        println("The Canine is roaming")
    }
}

class Wolf: Canine(){
    override val image = "wolf.jpg"
    override val food = "meat"
    override val habitat = "forests"

    override fun makeNoise(){
        println("Hooooowl !")
    }

    override fun eat(){
        println("The wolf is eating $food")
    }
}

class Hippo: Animal(){

    override val image = "hippo.jpg"
    override val food = "grass"
    override val habitat = "water"

    override fun makeNoise(){
        println("Grunt! Grunt!")
    }

    override fun eat(){
        println("The Hippo is eating $food")
    }
}