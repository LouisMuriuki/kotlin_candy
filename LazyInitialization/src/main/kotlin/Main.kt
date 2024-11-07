fun main() {
    println("Hello World!")
    var user1 = User("alex", "mwanzo", 80)
    var user2 = User("alexa", "mwanzia", 60)

    //lazy initializer
    val user3 by lazy {
        User("first", "last", 9)
    }

    println(user3.lastName)
}

class User(var firstname: String, var lastName: String, age: Int) {
    init {
        println("User:$firstname was created")
    }
}