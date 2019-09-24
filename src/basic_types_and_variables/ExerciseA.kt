package basic_types_and_variables

class ExerciseA {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

            var x: Double = 65.2
            var isPunk = true
            var message = "Hello"
            var y = 7
            var z: Int = y
            y += 50
            var s: Short
            var bigNum: Long = y.toLong()
            var b: Byte = 2
            var smallNum = b.toShort()
            b = smallNum.toByte()
            isPunk = false
            var k = y.toDouble()
            b = k.toByte()
        }
    }
}