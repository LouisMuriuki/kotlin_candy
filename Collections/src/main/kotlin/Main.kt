//lists-> ordered collections of items, not necessarirly unique.
//Sets-> Unique unordered collection of items
//since they are unordered you cant use the index access modifier only indexOf()
// ->all other list method can be used->in,count,add,remove
//Maps->sets of key value pairs that are unique and key must map to only one value,
//allow you to look up a value without using a numbered index.
//keys must be unique to get that particular value you want




fun main() {
    ListExample();
//    mapExamples();
}

fun mapExamples() {
//mutableMapOf<>() ->you can add or remove items to map;
    val users = mutableMapOf<Int, String>(1 to "Louis", 2 to "Hugo", 3 to "Martial")
    var names= mutableMapOf(1 to "one",2 to "two", 3 to "three")
    // to prevent unwanted modification of your map, you can cast it.->casting(remember?, check list above)
//    you can access item by using indexing
    println(names[1])
//    you can also add items through indexing
    users[5] = "Peter"

    users.remove(3)
    users.forEach { (t, u) ->
        println("$t and $u")
    }
    // to check if a key is in the map user .containsKey()
//    names.containsKey(2)

        //get all key -> names.keys
        //get all values -> names.values

//    check if a value is in the keys
      println(2 in names.keys)

}


fun ListExample() {
    val names = listOf<String>("Louis", "Lorna", "Kamau","Louis"); //readonly
    val testList=listOf(1 to "lui",2 to "mea")
    val testSet= setOf(1 to "lui",2 to "mea")
    val testMap= setOf(1 to "lui",2 to "mea")
    val testArray= arrayOf(1 to "lui",2 to "mea")

    println(testList)
    println(testSet)
    println(testMap)
    println(testArray.joinToString())

    //mutablelist accepts  duplicate items

    val namesMaster = mutableListOf("Louis", "Lorna", "Kamau", "Louis2"); //mutable
    //create a unmodifiable val to hold a list of mutable lists-> Known as casting
    val nameBoss= listOf(testArray.joinToString())

    println(nameBoss)

    //lists are ordered so to access them we use the index access operator[]
    println(namesMaster[1])
//    println(namesMaster.first())

    //.count to get number of items in a list
    println(namesMaster.count())

    //.in to checkk if an item is in the list
    println("Louis" in namesMaster)

    //.add() and .remove()


    val nameSet = setOf("Louis", "Lorna", "Kamau", "Louis");//even though we gat 2 luis, only one is printed
    val namesmasterSet = mutableSetOf("Louis", "Lorna", "Kamau", "Louis");
    println(nameSet)

    val one=namesmasterSet.indexOf("Louis")



    namesMaster.add("name2")

    namesMaster.remove("name2")


//    namesMaster.forEach { println(it) }
    // does not accept duplicates-last LOUIS WONT BE PRINTED
//    namesmasterSet.forEach { println(it) }


    // set uses the equality(referential/structural) operator to determine whether there are duplicates or not.
    // remember data class ?


    val user1 = User("louis")
    val user2 = User("louis")
    val user3 = User("louis")
    val user4 = User("Lorna")

    val anotherSet = mutableSetOf<User>(user4, user3, user2, user1)
    //without data class duplicates will be available,
    // with data class no duplicates

//    anotherSet.forEach { println(it.name) }

}


data class User(val name: String) {

}
