fun main() {
    val car1 = Car()

    car1.name = "voom"
    car1.model = "Maserati"
    car1.color = "bluish"
    car1.door = 4

    car1.move()
    car1.stop()


    val car2 = Vehicle("Tesla", "S-Plaid", "#15060D", 2)

    car2.move()
    car2.stop()

    val cow =Animal("musa","cow",)
    val cow2 =Animal("Lion" )
    val cow3 =Animal("Human" )
    val cow4 =Animal("Dog","anything")
    println("${cow.food} \n ${cow2.food} \n ${cow3.food} \n" +
            " ${cow4.food}" )

    val anim=Annimal(type = "whatever", food = "anything", name = "king")
    println("${anim.type} \n ${anim.food} \n ${anim.name} \n" )
    cow.makesound()


    user()
}

//objects represent realLife objects - state and functionality

fun user() {
    val luisec1 = UserSec("lui1", "lui")
    val lui = User("aouis", "Muriuki", 23)
    val luisec = UserSec("aouis")

    val friend = User("Alex", "Maina", 22)
    val defaultMe=UserDefault()
    println("${luisec.age},${lui.age},${luisec1.age},${friend.age}")
    println(defaultMe.name)
}


