fun main() {
    val user1 = User("Louis", "Muriuki", 24)
    val user2 = User("Louis", "Muriuki", 24)
//check for structural integrity
    println(user1 == user2)
    //check for referential  integrity ->in memeory
    println(user1 == user2)

    //== corresp

    println(user1)
}

//data class User(var firstName: String, var lastName: String, var age: Int)


// instead of doing aaaallllll this we can use kotlin concise approach of using a data class as above👆
class User(var firstName: String, var lastName: String, var age: Int) {

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        if (other is User) {

            return this.age == other.age && this.firstName == other.firstName && this.lastName == other.lastName

        }
        return false
    }

//whenever you override equals, you should also override the hashcode and tostring
    override fun hashCode(): Int {
        return 0
    }

    override fun toString(): String {
        return super.toString()
    }
}