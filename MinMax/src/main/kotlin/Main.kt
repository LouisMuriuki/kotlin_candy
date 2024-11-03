fun main() {
    val numbers = arrayOf(1, 23, 4, 5, 7, 6, 8, 6809, 90,0)
    val (maxNumber, minNumber) = getMinandMaxNumber(numbers)

    println("The max number is $maxNumber and the min Number is $minNumber ")
}

fun getMinandMaxNumber(numbers: Array<Int>): Pair<Int, Int> {

    var min = numbers[0]
    var max = numbers[0]

    for (number in numbers) {
        if (number < min) {
            min = number
        }
    }
    for (number in numbers) {
        if (number > max) {
            max = number
        }
    }
    return Pair(max, min)
}