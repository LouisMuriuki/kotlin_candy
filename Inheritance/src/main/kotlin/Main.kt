fun main() {
    println("Hello World!")

    val benzo = Car("mercedes", "black", 2, 4)
    val senna = Plane("senna", "black", 2, 4)
    val androidView = View()
    val button = Button("hello", "horizontal")
    val roundedButton = RoundButton("hello", "horizontal", 90)
//    println("${benzo.move()}")
    println("${androidView.draw()}")
    println("${button.drawButton()}")
    println("${roundedButton.drawRoundButton()}")


//    senna.move()
}

