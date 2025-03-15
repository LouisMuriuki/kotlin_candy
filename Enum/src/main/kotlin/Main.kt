
fun main() {
    for (direction in Direction.entries) {
        println(direction)
    }

    val error1=ErrorResult.valueOf("SUCCESS")

    println(error1)

    //val direction = Direction.EAST
    val direction = Direction.valueOf("EAST")

    when (direction) {
        Direction.EAST -> println("The direction is east")
        Direction.WEST -> println("The direction is west")
        Direction.NORTH -> println("The direction is north")
        Direction.SOUTH -> println("The direction is south")
    }

    val earth=Universe.Earth
}

enum class Direction(var direction: String, var distance: Int) {
    NORTH("north", 110),
    SOUTH("south", 90),
    EAST("east", 80),
    WEST("west", 880)
}

enum class ErrorResult(val message:String){
    SUCCESS("HI"),
    ERROR("SORRY")
}

enum class Universe(){
    Earth,
    Sun,
    Moon

}


sealed class BigUniverse(){
    class Earth:BigUniverse()
    class Sun:BigUniverse()
}