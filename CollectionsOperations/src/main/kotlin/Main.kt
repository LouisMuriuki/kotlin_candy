fun main() {
    // collections operations in kotlin rely on lambda functions such as map to do some transformations
    // for some/every element etc

    // mapTransformation()
    // zipTransformation()
    // unzipTransformation()
//    associationTransformations()
//    flattenTransformations()
    stringRepresentation()
}

fun stringRepresentation() {
    val numberStrings = listOf<String>("one", "two", "three");
    println(numberStrings.joinToString())

    val listString=StringBuffer("The list of numbers: ")
    println(numberStrings.joinTo(listString))

    println(numberStrings.joinToString(separator = " > ", prefix = "This is ", postfix = " . ", limit = 2))

    //convert a range to a list with the toList method
    val numbers=(1..1000).toList()
    println(numbers.joinToString(limit = 10))

    println(numberStrings.joinToString { "Element: ${it.uppercase()}" })

}


fun flattenTransformations() {
    val arrayNumbers = arrayOf(arrayOf(1, 2, 3), arrayOf(4, 5, 6), arrayOf(7, 8, 9))
    // to access "9" this is how we'd do it. This is only supported by arrayOf not other e.g setOf or listOf
    //index 2 in outer array and index 2 in inner array
    println(arrayNumbers[2][2])

    val numbersSet = listOf(setOf(1, 2, 3), setOf(4, 5, 6), setOf(7, 8, 9))
    println(numbersSet)
    val numbersFlatten = numbersSet.flatten() //breaks down multidimensional array to single dimensional array
    //gets your 9
    println(numbersFlatten[8])

    for (numbers in numbersFlatten) {
        println(numbers)
    }

}

fun associationTransformations() {
    val numbers = listOf("One", "Two", "Three", "Four")
    //elements of original collections will be the keys then you define the value
    println(numbers.associateWith { it.length })
    //elements from original collections will be the values then you define the keys
    println(numbers.associateBy { it.length })
    //transformation
    println(numbers.associateBy { it.length })

}

fun mapTransformation() {
    val numbers = setOf(1, 2, 3, 4, 5, 6);

    // println(numbers.map { it *40 })
    // println(numbers.map { if (it == 3) it * 40 else it * 80 })


    val numbersMap = mapOf("name1" to "louis", "name2" to "Muriuki", "name3" to null);

    println(numbersMap.map { it.key })

    //you decide new value for each key
    println(numbersMap.mapValues { if (it.key == "name1") "Lorna" else "none" })

    //you decide the new key for each value
    println(numbersMap.mapKeys { if (it.value == "louis") "name0" else "name6" })

    //return a list of non-null elements
    println(numbersMap.mapNotNull { if (it.value !== null) it else null })

    // diff from mapNotNull as this does not filter out null elements
    println(numbersMap.map { if (it.value !== null) it else null })
}

fun zipTransformation() {
    //zipping -> enables to do transformations between to collections.

    val animals = listOf("lion", "zebra", "girafee")
    val colors = listOf("brown", "white", "yellow")
    //creates a collections of pairs(tuples)
    println(animals.zip(colors))

    println(animals.zip(colors) { animal, color -> "The animals ${animal.replaceFirstChar { it.uppercase() }} is $color" })
}

fun unzipTransformation() {
    //unzip

    val numberPairs = listOf("one" to 1, "two" to 2, "three to 3", "four" to 4)
    // could not find function to unzip, was there in tutorial-> do some digging when you have time
    //println(numberPairs.unzip())


}