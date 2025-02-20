fun main() {

    //array length cannot change but you can change the array values ~
    println("Hello World!")
    val names = arrayOf("john", "louis", "test"); // this array is fixed, you cant add or remove items
    val items = arrayOf(4,5,6,7,8, "louis", "faith")
    val len = names.size
    println("The length of the array is $len")
//    val john = names[0]



    for (item in items){
        if(item is Int){
            println("the int's are, $item")
        }
    }
}