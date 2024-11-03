fun main() {
//    println("Hello World!")
//    makeMoney()
//    getMax(2, 7)
    loops()
}

fun makeMoney() {
    println("Make Money")
}

fun getMax(a: Int, b: Int): Int {
    val max = if (a > b) a else b
    defaultParams(message = "Hello")
    println(max)
    return max
}


fun defaultParams(name: String = "louis", message: String = "Hello guys") {
    println("The name is $name and the message is $message")
}

fun loops() {
    fun anotherLoop() {
        val numbers = 1..10
        for (i in 10 downTo 1) {
            println(i)
        }

        for (i in 1 until 10) {
            println(i)
        }

        for (number in numbers) {
            println(number)
        }

        // steps 3 in every loop iteration.
        for (i in 1..10 step 3) {
            println(i)
        }
        var number = 0
        while (number < 10) {
            println(++number)
        }
    }

    fun whileLoop() {
        var i = 0
        while (i < 10) {
            i++
            if (i == 5) {
                continue
            }
            println(i)

        }
    }

//    whileLoop()


    fun nestedWhileLooop() {
        var number = 0
        outer@ while (number in 0..10) {  //
            number++

            while (number >= 5 && number <= 10) {
                if (number == 8) {
                    break@outer  // you stop outer loop from inner loop using labels.
                }
            }
        }

    }

    nestedWhileLooop()
}
