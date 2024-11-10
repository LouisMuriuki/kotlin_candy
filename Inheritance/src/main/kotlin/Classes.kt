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