fun main() {
    // predicates are lambda functions that can in a collections of elements and return a boolean.
    //std lib has fn that filter collections, leave the original collections unchanged.

    val numbers = listOf("one", "two", "three", "four");
    val longerThan3 = numbers.filter { it.length > 3 }
    println(longerThan3)

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
    //Partition->filters elements in a predicate but keeps the elements that don't match in a separate list
    val (match, rest) = numbers.partition { it.length > 3 }
    println(match)
    println(rest)


}