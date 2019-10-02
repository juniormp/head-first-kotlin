package collections

class ExerciseD {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

            // List

            var mShoppingList = mutableListOf("Tea", "Eggs", "Milk")
            println("mShoppingList original: $mShoppingList")

            val extraShoppingList = listOf("Cookies", "Sugar", "Eggs")
            mShoppingList.addAll(extraShoppingList)
            println("mShoppingList items added: $mShoppingList")

            if(mShoppingList.contains("Tea")){
                mShoppingList.set(mShoppingList.indexOf("Tea"), "Coffee")
            }
            println("mShoppingList Tea -> Coffee: $mShoppingList")

            mShoppingList.sort()
            println("mShoppingList sorted: $mShoppingList")

            mShoppingList.reverse()
            println("mShoppingList reversed: $mShoppingList")

            // Set

            val mShoppingSet = mShoppingList.toMutableSet()
            println("mShoppingSet: $mShoppingSet")

            val moreShopping = setOf("Chives", "Spinach", "Milk")
            mShoppingSet.addAll(moreShopping)
            println("mShoppingSet items added: $mShoppingSet")

            mShoppingList = mShoppingSet.toMutableList()
            println("mShoppingList new version: $mShoppingList")
        }
    }
}