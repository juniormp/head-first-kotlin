package nulls_and_exceptions

class ExerciseA {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {


            // A
            var myCats = arrayOf(Cat("Misty!"), null, Cat("Socks"))
            for (cat in myCats){
                if(cat != null){
                    println("${cat.name}: ${cat.meow()}")
                }
            }

            // B
            var myCats2 = arrayOf(Cat("Misty"), Cat(null), Cat("Socks"))
            for (cat in myCats2){
                if(cat != null){
                    println("${cat.name}: ${cat.meow()}")
                }
            }

            // C
            var myCats3 = arrayOf(Cat("Misty"), Cat(null), Cat("Socks"))
            for (cat in myCats3){
                if(cat != null){
                    println("${cat.name}: ${cat?.meow()}")
                }
            }
        }
    }
}

class Cat(val name: String? = "") {
    fun meow() {
        println("Meow!")
    }
}