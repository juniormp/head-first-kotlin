package generics

class ExerciseC {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

            val catRetailer1 = CatRetailer()
            val catRetailer2: CatRetailer = CatRetailer()

            // When we prefix a generic type with out, we say that the generic type is covariant.
            // In other words, it means that a subtype can be used in place of a supertype.
            val petRetailer: Retailer<Pet> = CatRetailer()
        }
    }
}

interface Retailer<out T> {
    fun sell(): T
}

class CatRetailer : Retailer<Cat> {
    override fun sell(): Cat {
        println("Sell cat")
        return Cat("")
    }
}

class DogRetailer : Retailer<Dog> {
    override fun sell(): Dog {
        println("Sell dog")
        return Dog("")
    }
}

class FishRetailer : Retailer<Fish>{
    override fun sell(): Fish {
        println("Sell fish")

        return Fish("")
    }
}