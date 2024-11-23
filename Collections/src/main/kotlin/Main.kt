fun main() {
//    ListExample();
    mapExamples();
}

fun mapExamples() {
//mutableMapOf<>() ->you can add or remove items to map;
    val users = mutableMapOf<Int, String>(1 to "Louis", 2 to "Hugo", 3 to "Martial")
    users[5] = "Peter"
    users.remove(3)
    users.forEach { (t, u) ->
        println("$t and $u")
    }

}


fun ListExample() {
    val names = listOf<String>("Louis", "Lorna", "Kamau");

    //mutablelist accepts  duplicate items
    val namesmaster = mutableListOf("Louis", "Lorna", "Kamau", "Louis");
    val nameSet = setOf("Louis", "Lorna", "Kamau", "Louis");
    val namesmasterSet = mutableSetOf("Louis", "Lorna", "Kamau", "Louis");



    namesmaster.add("name2")

    namesmaster.remove("name2")


    namesmaster.forEach { println(it) }
    // does not accept duplicates-last LOUIS WONT BE PRINTED
    namesmasterSet.forEach { println(it) }


    // set uses the equality(referential/structural) operator to determine whether there are duplicates or not.
    // remember data class ?


    val user1 = User("louis")
    val user2 = User("louis")
    val user3 = User("louis")
    val user4 = User("Lorna")

    val anotherSet = mutableSetOf<User>(user4, user3, user2, user1)
    //without data class duplicates will be available,
    // with data class no duplicates

    anotherSet.forEach { println(it.name) }

}


data class User(val name: String) {

}
