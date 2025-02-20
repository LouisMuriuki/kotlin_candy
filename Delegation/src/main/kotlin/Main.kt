fun main() {
    // delegation is giving power from one class to another,
    // inheritance anables inheritance from only one class.
    // with delegationyou can inherit from multiple classes.
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

