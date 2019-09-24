package functions

class ExerciseA {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

            val options = arrayOf("Rock", "Paper", "Scissors")

            println(updateArray(options))
            println(options[2])
        }

        private fun updateArray(optionsParam: Array<String>) : String {
            optionsParam[2] = "Fred"
            return optionsParam[2]
        }

        fun getGameChoice(optionsParam: Array<String>) = optionsParam[(Math.random() * optionsParam.size).toInt()]
    }
}