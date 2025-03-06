fun main() {
    println("Hello World!")
    val success = Result.Success("SUCCESS")
//    val error = Result.Error("FAILED")
    val progress= Result.Progress("PROGRESS")
  val north=Direction.North("North")
println(north)
    getData(progress)
}

fun getData(result: Result) {

    when (result) {
//        is Result.Error -> result.showMessage()
        is Result.Success -> result.showMessage()
        is Result.Progress -> result.showMessage()
        is Result.Error.RecovarableErrors -> result.showMessage()
        is Result.Error.UnrecovarableErrors -> result.showMessage()
    }
}
//ALTERNATIVE TO ENUM CLASS
//sealed class are a type of class that restricts the hierarchy of subclasses,
//useful when you want to represent a fixed type pf possible types in a type safe manner
sealed class Result(val message: String) {

    fun showMessage() {
        println("Result: $message")
    }


    class Success(message: String) : Result(message)

    sealed class Error(message: String) : Result(message){
    class RecovarableErrors(exception: Exception, message: String):Error(message)
    class UnrecovarableErrors(exception: Exception,message:String):Error(message)
    }
    class Progress(message:String): Result(message)

}

sealed class Direction(val message:String){
      fun showMessage(){
          println("We are in the , $message")
      }

    class North(message:String):Direction(message)

}