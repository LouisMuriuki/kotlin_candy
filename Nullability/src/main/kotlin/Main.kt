fun main() {
    var text: String? = null
    text = "hey"
    println("Hello World!, ${text?.length} ") //works like if statement, like js
    println("Hello World!, ${text!!.length} ") //gets you a null pointer exception

    val text2 = text ?: "This variable is not null";
}