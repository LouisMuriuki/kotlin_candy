fun main() {
    println("Hello World!")
    val success = Result.Success("SUCCESS")
//    val error = Result.Error("FAILED")
    val progress= Result.Progress("PROGRESS")


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