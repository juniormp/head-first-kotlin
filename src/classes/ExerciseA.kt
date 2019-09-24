package classes

class ExerciseA {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

            val d = DrumKit(hasTopHat = true, hasSnare = true)

            d.playSnare()
            d.playTopHat()

            d.hasSnare = false

            d.playSnare()
            d.playTopHat()

        }
    }
}


class DrumKit(var hasTopHat: Boolean, var hasSnare: Boolean){

    fun playTopHat(){
        if(hasTopHat){
            println("bang bang bang!")
        }
    }

    fun playSnare(){
        if(hasSnare){
            println("ding ding ba-da-bing!")
        }
    }
}