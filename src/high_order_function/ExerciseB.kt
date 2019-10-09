package high_order_function

class ExerciseB {
    
}

abstract class Pet(var name: String)

class Cat(name: String) : Pet(name)
class Dog(name: String) : Pet(name)
class Fish(name: String) : Pet(name)

class Contest<T: Pet>() {

    var scores: MutableMap<T, Int> = mutableMapOf()

    fun addScore(t: T, score: Int = 0) {
        if (score >= 0) scores.put(t, score)
    }

    fun getWinners(): Set<T>{
        val highScore = scores.values.max()
        val winners = scores.filter { it.value == highScore }.keys

        winners.forEach { println("Winner: ${it.name}")}

        return winners
    }
}

