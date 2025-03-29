// let run with apply also
fun main() {
    val user = User()
// scope fns are fn that can be called on almost an object
//    execute a block of code on an object
    //context object can be reffered using "it" or "this" keyword
//    return value can be context object or lambda result
    //withscope fn, return value is lambda result
    //lets you access the context object, modify(not recommeded) and perform computations
    with(user) {
        firstName = "louis"
    }
    val result = with(user) {
        this.lastName = "" // can also use this keyword, but for conciseness not a must
        firstName = "louis"
//        this //last line of code is the type of the return value(this-> current object)... change to int, Char to see
    }
    //apply scope fn, return value is the object
    //best to modify
    user.apply { this.firstName = "Alex" }


//used when you want to perform more operations on your expressions
//also scope fn, return value is the context object
    Vehicle("Mercedes", 2).also {
        println(it)
    }


    //let scope function, return value is the lambda result
    var text: String? = null
    //execute code only if not null
    text?.let {
        println(it)
    }


    //combination of let and with
    //run scopefn, return value is the lambda result
    //only runs when user is not null
    user?.run {
        println(firstName)
        println(lastName)
    }

}

class User {
    var firstName = ""
    var lastName = ""
}

data class Vehicle(var name: String, var doors: Int)