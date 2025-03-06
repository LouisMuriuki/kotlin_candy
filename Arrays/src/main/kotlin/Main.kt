//using primitives in an object array is not recommended as the primitives will be boxed
//boxing introduces perf overhead.
//use arrays for performance gains else use collections
//when to use collections instead
//->when you need readonly data.
//when you are going to be adding and removing regularly,
// array are fixed in size, create a new one each time which is inefficient.

fun main() {
    println("Hello World!")

    val numbers =arrayOf<Int>(1,2,3)
    val numberStrings =arrayOf(1 to "ha",2 to "he",3 to "hi")
    val names=arrayOf(1 to "one",2 to "two")
    val numbersNumbers:Array<Pair<Int,Int>> = arrayOf(1 to 1)
    println(numbers.joinToString()).also { println(numbers) }
    println(numberStrings.joinToString())  // without this wil pint out the mem address
    val empty= emptyArray<Int>()
    val nulls:Array<Int?> = arrayOfNulls(3) //prints out null, null null
    ;
    val sequence= Array(5){i->i.toString()} // 0 to 4
    val squares=Array(5){i->(i*i).toString()}
    val squares1=Array(5){(it*it).toString()}
    println(sequence.joinToString())
    println(squares.joinToString())
    println(squares1.joinToString())
    println(empty.joinToString())  // print out blank space
    println(nulls.joinToString())


    //nested arrays
    //2DArray
    val twoDArray = Array(2){ Array<Int>(2) { 0 } }
    println(twoDArray.contentDeepToString())

    //3DArray
    val threeeDarray=Array(1){Array(2){Array(1){-1} } }

    println(threeeDarray.contentDeepToString())

    //arrays are always accesible using indexes

//vararg/varargs-variable number of arguments
    fun spitArrays(vararg numbers: Array<Int>){
        try {
            if(numbers.isEmpty()){
                return println("pass some arguments please")
            }
            numbers.forEach { println(it.joinToString()) }
        }catch(e:Exception) {
            println("error is $e")
        }



    }

spitArrays(numbers)
    print("I ran")
    //compare arrays
    val simpleArray=arrayOf<Int>(1,2,3)
    val arary2=arrayOf<Int>(1,2,3)
    val anotherArray=arrayOf<Int>(1,2,3)

    // Compares contents of arrays
    //infix functions don't require a dot
    println(simpleArray contentEquals anotherArray)


//    Array transformation

    println(numbers.sum())
    println(numbers.shuffle()) //shuffles elements in array

    println(numbers.toList())
    println(numbers.toSet()).also { println(numbers.count()) }

//    to map
//only an array of Pair<KV> can be converted to a map
//    first value becomes key and the second becomes a value
//    keys must be unique and the latest key replaces any existing one

    val data = arrayOf(1 to "Lilian",2 to "Muriuki",1 to "Michele")

println(data.toMap())
 // there are other type sof arrays check them out.
    var jdcvd=IntArray(3){ it+2 }

    println(jdcvd.joinToString())

}