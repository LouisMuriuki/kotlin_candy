fun main() {
    println("Hello World!")
    val numbers=listOf(5,6,83,17,9,31)
    println(numbers.count())
    println(numbers.sum())
    println(numbers.average())
    println(numbers.minOrNull())
    println(numbers.maxOrNull())
    println(numbers.sumOf() {it*2}) /// takes the sum first then other operation follows
    println(numbers.maxOrNull())

    //comparable
    val laptops= mutableListOf(
        Laptop("Lenovo",2022,16,175000),
        Laptop("Mac",2020,8,110000),
        Laptop("Dell",2012,8,30000),
    )

    laptops.sorted().forEach { println(it) }

    ////

// ComparatorRam
    laptops.sortedWith(ComparatorRam()).forEach { println(it) }


    //easier less concise way to sort with comparable
    laptops.sortedWith(compareBy { it.ram }).forEach { println(it) }

    // You can chain multiple sort criteria
     laptops.sortedWith(compareBy<Laptop> { it.ram }.thenBy { it.year }).forEach { println(it) }


//even much easier
    laptops.sortedBy { it.price }
// if you check sortedBy source code - you'll see it implements something similar to above code ~ sortedWith(compareBy)

}

data class Laptop(val brand:String, val year:Int, val ram:Int, val price:Int):Comparable<Laptop>{
    override fun compareTo(other: Laptop): Int {
        return if (this.price > other.price) {
            1
        } else if (this.price < other.price) {
            -1
        } else {
            0  //equal
        }
    }
}

class ComparatorRam : Comparator<Laptop> {
    override fun compare(laptop1:Laptop, laptop2: Laptop): Int {
     return if (laptop1.ram > laptop2.ram) {
            1
        } else if (laptop1.ram < laptop2.ram) {
            -1
        } else {
            0  //equal
        }
    }
}