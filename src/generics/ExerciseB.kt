package generics

class ExerciseB {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

            val catFuzz = Cat("Fuzz Lightyear")
            val catKatsu = Cat("Katsu")
            val fishFinny = Fish("Finny McGraw")

            val catOwner = PetOwner(catFuzz)
            catOwner.add(catKatsu)
        }
    }
}


class PetOwner<T: Pet>(t: T){
    val pets = mutableListOf(t)

    fun add(t: T){
        pets.add(t)
    }

    fun remove(t: T){
        pets.remove(t)
    }
}