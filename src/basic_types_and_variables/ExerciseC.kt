package basic_types_and_variables

class ExerciseC {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            hobbits()
            fireman()
        }

        private fun hobbits() {
            val hobbits = arrayOf("Frodo", "Sam", "Merry", "Pippin")
            var x = 0;

            while (x < 4) {
                println("${hobbits[x]} is a good Hobbit name")
                x += 1
            }
        }

        private fun fireman(){
            val firemen = arrayOf("Pugh", "Pugh", "Barney McGrew", "Cuthbert", "Dibble", "Grub")
            var firemanNo = 0

            while(firemanNo < 6){
                println("Fireman number $firemanNo is ${firemen[firemanNo]}")
                firemanNo += 1
            }
        }
    }
}