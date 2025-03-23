fun main() {
    println("Hello World!")


    var list = listOf("one", "two","three")

    println(list.any { it.startsWith("o") })
    println(list.none { it.endsWith("e") })
    println(list.all { it.length>1 })
}