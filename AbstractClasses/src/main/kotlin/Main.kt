fun main() {
    println("Hello World!")
    var tesla=Car("model X","blue",1,4)


    tesla.move()
}
// cant create instances with abstract classes or sealed classes -> mostly for inheritance

//define what needs to be done without stating how.- define functions without body and code
abstract class Vehicle {

    val text = "Some text"
    abstract fun move()

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