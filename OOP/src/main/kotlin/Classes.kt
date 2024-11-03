//constructor WITH PARAMETRS AS  WELL AS PROPERTIES
class Vehicle(name: String, var model: String, var color: String, var door: Int) {
    var name = name.trim()

    fun move() {
        println("The car $name is moving")
    }

    fun stop() {
        println("the car $name is gonna stop")
    }
}

// classes have inside em state (variables), functionality (functions)
class Car {
    var name = ""
    var model = ""
    var color = ""
    var door = 0


    fun move() {
        println("The car $name is moving")
    }

    fun stop() {
        println("the car $name is gonna stop")
    }
}

//primary constructor
class User(name: String, var lastName: String, var age: Int) {

    var name: String

    init {
        if (name.lowercase().startsWith("a")) {
            this.name = name
        } else {
            this.name = "User"
            println("Doesnt start with letter A or a")
        }
    }

}

// secondary constructor
class UserSec(name: String, var lastName: String, var age: Int) {

    //secondary constructors cannot declare variables only pass properties i.e you cant do var name
    constructor(name: String) : this(name, "LastName", 0){
        //execute some code
        println("2nd")
    }

    constructor(name:String,lastname:String): this(name,lastname,0){
        println("3rd")
    }

}