class Team<T:Player>(val name:String, val Players:MutableList<out T>):Player(name){

    fun addPlayer(player: T){
        if(Players.contains(player)){
            println("Already exists")
        }else{
            Players.add(player)
            println("Player added to team")
        }
    }

}

class FootBallPlayer(name:String,age:Int):Player(name){

}
class BasketBallPlayer(name:String,age:Int):Player(name){

}
open class Player(name:String){

}
open class GamesPlayer( name: String,game:String)


class counterStrikePlayer(name: String, age: Int):GamesPlayer(name,"CounterStrike")



fun main() {
    println("Hello World!")


    var Player1= FootBallPlayer("louis",22)


    var Player2= FootBallPlayer("louis",22)

    var Team1=Team("lui", mutableListOf(Player1))

   Team1.addPlayer(Player2)

//    covariance - allow us not to pass an exact type of a class but pass a sub-class to that type, going down the inheritance tree
//    you must place out keyword before the generic type
    //i.e here we expect Player but we pass BasketBall Player instead
    val footballTeam=Team<Player>(
        "Footballl Team",
        mutableListOf<BasketBallPlayer>(BasketBallPlayer("tqanaka",34),BasketBallPlayer("yoniga",23)))

//    countervariance - allow us not to pass an exact sub-type of a class but pass a class to that type, going up the inheritance tree
//    you must place out keyword before the generic type

    val counterplayer1=GamesPlayer("ppet","Conterstrike1")
    val counterplayer2=GamesPlayer("ppet2","Conterstrike2")

//    val GamesTeam=Team<counterStrikePlayer>("TeamMonster", mutableListOf<GamesPlayer>(counterplayer1,counterplayer2))

}



