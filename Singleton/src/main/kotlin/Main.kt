import javax.xml.crypto.Data

fun main() {
    //design pattern to have only one instance of a particular object globally.
    //calling the initializer again won't result in another instance if created
    println("Hello World!")
//    val instance =Database.getInstance()
//    val instance2 =Database.getInstance()

//    println("$instance,$instance2")

    println(Database)
    println(Database)
}
//old way to do it.
//class Database private constructor() {
//
//    companion object {
//        private var instance: Database? = null
//        fun getInstance():Database? {
//            if (instance == null) {
//                instance = Database()
//            }
//            return instance
//        }
//    }
//}

// new way to do it
object Database{
    init{
        println("Databse created")
    }
}