fun main() {
    val result=Calculator.sum(10, 8)

    //also variables can be called directly from companion objects.
    println(Calculator.max)
    println(result)

    //remember how we can get max value of the int type
    println(Int.MAX_VALUE)
//max value is a companion object of class Int
}


