package generics

class ExerciseA {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

            val catVet = Vet<Cat>()
            val dogVet = Vet<Dog>()
            val fishVet = Vet<Fish>()
            val vet = Vet<Pet>()


            val catContest = Contest<Cat>(catVet)
            catContest.addScore(Cat("Fuzz Lightyear"), 50)
            catContest.addScore(Cat("Katsu"), 45)
            val topCat = catContest.getWinners().first()
            println("Cat contest winner is ${topCat.name}")

            val dogContest: Contest<Dog> = Contest(vet)
            dogContest.addScore(Dog("Fibo"), 58)
            val topPet = dogContest.getWinners().first()
            println("Pet contest winner is ${topPet.name}")


            val fishContest = Contest2(Fish("Finny McGraw"))
        }
    }
}

abstract class Pet(var name: String)

class Cat(name: String) : Pet(name)

class Dog(name: String) : Pet(name)

class Fish(name: String) : Pet(name)

class Contest2<T : Pet>(t: T) { }

class Contest<T : Pet> (var vet: Vet<T>) {
    private val scores: MutableMap<T, Int> = mutableMapOf()

    fun addScore(t: T, score: Int = 0) {
        if (score >= 0)
            scores.put(t, score)
    }

    fun getWinners(): MutableSet<T> {
        val highScore = scores.values.max()
        val winners: MutableSet<T> = mutableSetOf()

        for ((t, score) in scores)
            if (score == highScore) winners.add(t)

        return winners
    }

}

// When we prefix a generic type with in, we say that the generic type is contravariant.
// In other words, it means that a supertype can be used in place of a subtype.

class Vet<in T: Pet> {
    fun treat(t: T){
        println("Treat Pet ${t.name}")
    }
}