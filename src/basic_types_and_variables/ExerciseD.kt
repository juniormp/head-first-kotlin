package basic_types_and_variables

class ExerciseD {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            codeMagnets()
        }

        fun codeMagnets() {
            val fruit = arrayOf("Apple", "Banana", "Cherry", "Blueberry", "Pomegranate")
            val index = arrayOf(1, 2, 3, 4)
            var y: Int
            var x = 0

            while (x < 4) {
                y = index[x]
                println("Fruit = ${fruit[y]}")

                x += 1
            }
        }
    }
}