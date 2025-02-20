fun main() {
    println("Hello World!")
}
// comonly used behaviour shared among diff classes, you dont want to provide the actual code that goes into those
// classes to implement the interface.


// cannot have constructors-> they cannot be instantiated only implemented->dont create objects, also dont maintain state
//abstract classes can have constructors, they maintain state
interface Engine{
    fun startEngine()
}

class Car(val name:String, val color:String):Engine{
    override fun startEngine() {
        println("The car is starting the engine")
    }

}

class Truck(val name:String, val color:String):Engine{
    override fun startEngine() {
        println("The truck is starting the engine")
    }

}
class Plane(val name:String, val color:String):Engine{
    override fun startEngine() {
        println("The plane is starting the engine")
    }

}