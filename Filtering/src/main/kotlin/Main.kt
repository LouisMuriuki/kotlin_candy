fun main() {
    collectionsFiltering()
//    plusorMinus()
}
fun collectionsFiltering(){
    // predicates are lambda functions that can take in a collections of elements and return a boolean.
    //std lib has fn that filter collections, leave the original collections unchanged.

    val numbers = listOf("one", "two", "three", "four");
    val longerThan3 = numbers.filter { it.length > 3 }
  //  val longerThan4 = numbers.filter(this=>this>=3) // not applicable in kotlin
    println(longerThan3)
    //partition just like filter but saves two list, 1.matches condition the other not so
    val (match,rest) = numbers.partition { it.length > 3 }
    println(match).also { println(rest) }

    val numbersMap = mapOf(1 to "1", 2 to "two", 3 to "three", 101 to "101")
    val filteredNumbersMap = numbersMap.filter { it.key > 100 && it.value.endsWith("1") }
    println(filteredNumbersMap)

    val filterIndex = numbers.filterIndexed { index, value -> index != 0 && value.length < 5 }

    val filterNot = numbers.filterNot { it.length <= 3 }

    println("FilteredIndex: $filterIndex")
    println("FilteredNot: $filterNot")

    val mixedList = listOf(1, 2, 3, 4, 5, 'A', 'B', 'C', 'D', "yeah", "Baby", false, true);
    mixedList.filterIsInstance<Int>().forEach {
        println(it)
    }

    println("\n")

    ///testing predicates

    println(numbers.any { it.endsWith("e") })
    println(numbers.none { it.endsWith("e") })
    println(numbers.all { it.endsWith("u") })


}

fun plusorMinus() {
    val numbers = mutableListOf("one", "two", "three", "four");
    val plusNumber = numbers + "five" //here it creates a new list
    numbers.add("five") //this will modify current list, see the difference?
    println(plusNumber) // new list

    val minusNumber = numbers - "one"
    println(minusNumber)
    val minusList=numbers- mutableListOf("two", "three")
    println(minusList)

}