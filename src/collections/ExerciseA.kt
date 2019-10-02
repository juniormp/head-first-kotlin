package collections

class ExerciseA {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

            val mShoppingList = mutableListOf("Tea", "Eggs", "Milk")
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
        }
    }
}