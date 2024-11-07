fun main() {
    for (direction in Direction.values()) {
        println(direction)
    }

    //val direction = Direction.EAST
    val direction = Direction.valueOf("EAST")

    when (direction) {
        Direction.EAST -> println("The direction is east")
        Direction.WEST -> println("The direction is west")
        Direction.NORTH -> println("The direction is north")
        Direction.SOUTH -> println("The direction is south")
    }
}

enum class Direction(var direction: String, var distance: Int) {
    NORTH("north", 110),
    SOUTH("south", 90),
    EAST("east", 80),
    WEST("west", 880)
}