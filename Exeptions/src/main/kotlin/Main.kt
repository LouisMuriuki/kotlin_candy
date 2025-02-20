import java.lang.ArithmeticException
val a =5
val b =0
fun main() {




try {
    println(a/b)
}    catch (e:ArithmeticException){
   println("You can't divide by zero:${e.message}")
}finally {
    print("try again please")
}
}

// as expression
fun tryAsExpression(){
    val result =try {
        println(a/b)
    }    catch (e:ArithmeticException){
        println("You can't divide by zero:${e.message}")
        0
    }finally {
        print("try again please")
    }
println(result)
}