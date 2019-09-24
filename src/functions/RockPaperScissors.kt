package functions

class RockPaperScissors {
    companion object {
        @JvmStatic

        fun main(args: Array<String>) {
            val options = arrayOf("Rock", "Paper", "Scissors")
            val gameChoice = getGameChoice(options)

            getUserChoice(options)
        }

        private fun getGameChoice(optionsParam: Array<String>) =
            optionsParam[(Math.random() * optionsParam.size).toInt()]

        private fun getUserChoice(optionsParam: Array<String>): String {
            println("Please enter one of the following: Rock Paper Scissors.")

            for (item in optionsParam) println("$item")
            println(".")

            val userInput = readLine()

            return "s"
        }
    }
}