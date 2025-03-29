// during the construction of a new instance of a derived class, the base class initialization is done as the first step{base class init scope runs then the code in base class)
// then afterwards the derived class init will run followed by the code execution in the class
// ok this means what exactly?
//when the base class is being constructed, the properties of the derived class has not yet been initialized, using any of those properties in the base class initialization logic
// may lead to incorrect behaviour
// when designing a base class you should avoid using open members in the constructor property initializer or init block

//In Kt classes are final by default, the only way to make them extendable is add open keyword before class.
open class Vehicle(val name: String, val color: String) {

    open fun move() {
        println("$name is moving")
    }

    open fun stop() {
        println("$name has stooped")
    }
}

class Car(name: String, color: String, val engines: Int, val doors: Int) : Vehicle(name, color) {



}

class Plane(name: String, color: String, val engines: Int, val doors: Int) : Vehicle(name, color) {

    override fun move() {
        flying()
        super.move()
    }

    override fun stop() {

        super.stop()
    }

    fun flying() {
        println("The plane is flying")
    }

    inner class Apache{
        fun flyApache(){
            println("Apache has starte moving... standby")
            super@Plane.move()

        }
    }
}


open class View(){
    open fun draw(){
        println("drawing the view")
    }
}

open class Button(val text:String,orientation:String):View(){

    override fun draw() {
        drawButton()
        super.draw()
    }

    fun drawButton(){
        println("drawing the button")
    }

}

class RoundButton(text: String,orientation: String,val corners:Int):Button(text,orientation){
    override fun draw() {
        drawRoundButton()
        super.draw()
    }

    fun drawRoundButton(){
        println("drawing the round button")
    }
}

//how to inherit from am interface and open class at the same time

open class Rectangle {
    open fun draw() { /* ... */ }
}

interface Polygon {
    fun draw() { /* ... */ } // interface members are 'open' by default
}

class Square() : Rectangle(), Polygon {
    // The compiler requires draw() to be overridden:
    override fun draw() {
        super<Rectangle>.draw() // call to Rectangle.draw()
        super<Polygon>.draw() // call to Polygon.draw()
    }
}