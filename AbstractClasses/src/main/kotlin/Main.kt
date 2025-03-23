fun main() {
    println("Hello World!")
    var tesla=Car("model X","blue",1,4)


    tesla.move()
    tesla.text
}
// cant create instances with abstract classes -> can only be inherited

//define what needs to be done without stating how.- define functions without body and code

//mostly used in event handling in android.
abstract class Vehicle {

    val text = "Some text"
    abstract fun move() //also mark fun with abstract keyword.

    abstract fun stop()
}

class Car(var name: String, var color: String, val engines: Int, val doors: Int):Vehicle() {


    override fun move() {
        println("$name is moving")
    }

    override fun stop() {
        TODO("Not yet implemented")
    }

}