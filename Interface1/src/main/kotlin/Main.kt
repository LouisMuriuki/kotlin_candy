fun main() {
    println("Hello World!")
    //each button now has its own impl of the onpress
//object expression
    //anonymous class ->object:etc (it is anonymous coz its instantiated and created at the same time)

    val loginButtton= Button("login",1245,object:OnPress{
        override fun handleClick() {
            TODO("Not yet implemented")
        }

    })

    val signupButton=Button("Signup", 245,object:OnPress{
        override fun handleClick() {
            TODO("Not yet implemented")
        }

    })
}

class Button(var text:String, var id:Int,OnPress:OnPress){

}


interface OnPress{
    fun handleClick()

}