fun main() {
    var text: String? = null
//    text = "hey"
    println("Hello World1!, ${text?.length} ") //works like if statement, like js
//    println("Hello World2!, ${text!!.length} ") //gets you a null pointer exception ~ NON NULL ASSERTION(BASICAALY SAYS IT CAN'T BE NULL)
    println("Hello World2!, ${text.length} ") //gets you a null pointer exception

    val text2 = text ?: "This variable is not null";
}