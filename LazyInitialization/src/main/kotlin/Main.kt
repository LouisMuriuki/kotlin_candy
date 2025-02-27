fun main() {
    println("Hello World!")
    var user1 = User("alex", "mwanzo", 80)
    var user2 = User("alexa", "mwanzia", 60)

    //lazy initializer->only initialized when the class is called
    val user3 by lazy {
        User("first", "last", 9) //code in init will not run yet
    }

    user3.firstname.also { println() } // code in init will run nere

    

//    val user by lazy {
//        User("", "", 0)
//    }
//
//    val lazy:User by lazy {User("yoo", "sadins",8)}
}
class User(var firstname: String, var lastName: String, age: Int) {
    init {
        println("User:$firstname was created")
    }
}