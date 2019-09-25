package nulls_and_exceptions

class BadException : Exception()

fun myFunction (test: String){
    try {
        riskyCode(test)

    } catch (e: BadException){
        println("Bad Exception")
    } finally {
        println("Finally")
    }
}

fun riskyCode(test: String){
    if (test == "Yes")
        throw BadException()
}