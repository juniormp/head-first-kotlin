package classes

class ExerciseB {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

            val tapeDeck = TapeDeck()

            tapeDeck.hasRecorder = true
            tapeDeck.playTape()
            tapeDeck.recordTape()

            val dvd = DVDPlayer(true)
            dvd.playDVD()
            dvd.recordDVD()

        }
    }
}

class TapeDeck {
    var hasRecorder = false

    fun playTape() {
        println("Tape playing")
    }

    fun recordTape() {
        if (hasRecorder) {
            println("Tape recording")
        }
    }
}

class DVDPlayer(var hasRecorder: Boolean){
    fun recordDVD(){
        if (hasRecorder) {
            println("DVD Recording")
        }
    }

    fun playDVD(){
        if (hasRecorder) {
            println("DVD playing")
        }
    }
}