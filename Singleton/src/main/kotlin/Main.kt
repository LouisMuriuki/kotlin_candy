// instantiated by the word object

fun main() {
    //singleton design pattern allows you to have only one instance of a particular object globally.
    //calling the initializer again won't result in another instance if created

//    val instance =Database.getInstance()
//    val instance2 =Database.getInstance()

//    println("$instance,$instance2")

    println(Database)
    println(Database)
    println(Singleton)
    println(Singleton)


}
//old way to do it.
//here we have constructor keyword because we have access modifier private.
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
        println("Database created")
    }

    //object automatically creates a singleton with one instance.


}

object Singleton{
// you cannot have companion object inside here X
// why? not allowed, object is already a singleton.
}


class MySingleton private constructor(){
    companion object{
        val DBinstance:MySingleton? = null

        fun getInstance():MySingleton?{
            if (DBinstance==null){
                return DBinstance
            }else {
                return null
            }
        }
    }
}


