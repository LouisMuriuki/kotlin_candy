

fun main() {
    var myLambda={a:Int,b:Int -> println("A+b=${a+b}")}
    var smallLambda={a:Int -> println("A=${a}")}
    var myLambda2:(Int,Int)-> Unit ={a,b -> println("A+b=${a+b}")}
    println("Hello World!")
      add(5,10,smallLambda)
      add(5,10) { smallLambda } // you can also move the lambda from the parenthesis and wrap it in a bracket if it'0-67as the last parameter

upperCase("text"){it.uppercase()}
    laugh("Haha"){it.uppercase()}
}

 var lambda={a:Int,b:Int->(a+b)}



fun upperCase(text:String,uppercaselambda:(String)->String){
    val uppercased=uppercaselambda(text)
    println(uppercased)
}

fun add(a:Int,b:Int,action:(Int)->Unit){
    action(a+b)
}




fun laugh(laughter:String,laughing:(String)->String){

    var laugh= laughing(laughter)

    println(laugh)

}

