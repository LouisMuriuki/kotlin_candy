//constructor WITH PARAMETRS AS  WELL AS PROPERTIES
//without val is parameter, with val is a property

//constructors are used to initialize objects

//primary constructor                           secondary constructor
//declared in header                              Declared in class body
//use init to initialize                           can use custom logic
//only one                                          can be many
//create one object at atime                         create many objects with diff parameter set

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

    //this code runs during object creation i.e first code to executed
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
    //this calls primary constructor to initialize the object
//    secondary constructor takes in parameters abd calls the primary cnstructor
    constructor(name: String) : this(name, "LastName", 0) {
        //execute some code
        println("2nd")
    }

    constructor(name: String, lastname: String) : this(name, lastname, 0) {
        println("3rd")
    }

}

//here we can also use default parameters instead of secondary constructor.
//secondary constructor is ussefu; when you want to run some code.
//without secondary constructor we would have to create a class for each objects
//we can use default values as well as named arguments to achieve the same
class UserDefault(var name: String = "Louis", var lastName: String = "Hugo", var age: Int = 23) {

    init {
        if (name.lowercase() == "louis") {
            this.name = "louis"
        } else {
            this.name = "Louis"
        }
    }}
class Animal(name:String, var type:String, food:String) {
    var name: String
    var food: String

    constructor(name:String,type: String):this(name,type,"grass")

    constructor(type: String):this("Michael",type,"Meat")


    init {
        this.name = name
        this.food= food
    }

    fun makesound() {
        if (this.type == "cow") {
            println("moooo")
        }
    }

}


class Annimal(name:String="louis", var type:String="cow", food:String="grass") {
    val name: String;
    val food: String;

    init {
this.name=name
        this.food=food
    }


}
