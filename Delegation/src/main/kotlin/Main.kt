fun main() {
    println("Hello World!")
}

class App():A by Firstdelegate(), B by secondDelegate(){
    override fun printA() {
        println("something")
    }

    override fun printB() {
        TODO("Not yet implemented")
    }

}


interface A {
    fun printA(){}

}

interface B {
    fun printB(){}

}

open class Firstdelegate:A{
    override fun printA() {


    }
}

open class secondDelegate:B{
    override fun printB() {

    }
}


