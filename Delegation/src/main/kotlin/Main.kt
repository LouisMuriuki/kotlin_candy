fun main() {
    // delegation is giving power from one class to another,
    // inheritance enables inheritance from only one class.
    // with delegation, you can inherit from multiple classes.
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

//not understanding?
//say we wanted to inherit pritnA as by done in firstdelegate and printB as done in seconddelegate each in our class
//class implement():Firstdelegate(), secondDelegate()  //this not possible
//but what we can do is say
//lets inherit pritntA by firstdelegate impl and pritntB respectively

class implement:A by Firstdelegate(), B by secondDelegate(){
    override fun printA() {
        super.printA()
    }

    override fun printB() {
        super.printB()
    }

}
interface A {
    fun printA(){}

}

interface B {
    fun printB(){}

}
//inherits the interface, and overides the impl, then we can use ths impl in out delegation class
open class Firstdelegate:A{
    override fun printA() {


    }
}
//inherits the interface, and overides the impl, then we can use ths impl in out delegation class
open class secondDelegate:B{
    override fun printB() {

    }
}

