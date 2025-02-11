fun main() {
    println("Hello World!")
    //no need for ternary operator(?) as if is an expression
var c=9
    var a =6
    var b=5
    val max:Any
    max=if(a>b) {  //branches can be blocks as well
        a
    } else if(b>a) {
        b
    } else "Neutral";
    println(max)

    //when-> just like a switch statement
    //statement->just prints no return
    when (a){
        6 -> println("the value is 6")
        5,7 -> println("the value is 5 or 7") // you can combine conditions
        else -> println("could not detect shit")
    }
    //can be used as statement-returns nothing
    //as well as expression-returns something and must be exhaustive

    //as expression
    var data=when(a){
        5-> a
        6-> b
        else -> ""
    }

    //when can be used without a subject, however it must be exhaustive
    when{
        a==5 -> println("five")
        b==6  -> println("six")
        else -> println(null)
    }

//    guard conditions
//chain multiple conditions in when expressions branches separated by if

    when {
        a==5 -> println("five")
        b==6  -> println("six")
        else -> println(null)
    }


    //loops and labels

    //labelled break.
//    labels can be used to exit out of a loop early
    fun loopAndLabels(){
        outer@ for(i in 1..3){
            for(j in 1..9){
                println("$i,$j")
                break@outer //breaks outer loops breaking inner loop
            }
        }

        for (i in 1..10){
            if(i==7) continue
            println(i)
        }

        
    }


loopAndLabels()


}