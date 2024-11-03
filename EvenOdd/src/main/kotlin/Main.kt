fun main() {
    val (totalEvenSum, totalEven)= calculateTotal()
    println("The even total sumis,$totalEvenSum and the even total count is $totalEven")
}

fun calculateTotal(): Pair<Int, Int> {
    var totalEvenSum = 0
    var totalEven = 0
    for (index in 1..20) {
        if (index % 2 == 0) {
            println(index)
            totalEven++
            totalEvenSum += index
        }
    }
    return Pair(totalEvenSum, totalEven);
}