fun main() {
    val user2 = User(firstName = "louis")
    //does not mutate directly, will call the setter
    user2.firstName = "Muriuki"
    println(user2.age)

    val userlateinit = Lateinit("Louis", "Hugo", "Muriuki")
    userlateinit.favouriteMovie = "Interstellar"

    //lateinit does not support primitive types i.e Int, only class data type i.e Strings

    println(userlateinit.favouriteMovie)
}