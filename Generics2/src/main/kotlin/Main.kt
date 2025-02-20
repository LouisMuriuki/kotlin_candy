//generic and type checking dont make it to the jvm runtime, they are onl;y a compile time feature.
// however we can make our type reach the runtime using the reified keyword, please remember reified keywords are only used in line functions
fun main() {
  val list = mutableListOf("Hello", "world",1,2,65,8,'f','r',"mama yo")

   var specificList =getSpecificList<Char>(list)

    println(specificList)
}

//generic function
inline fun <reified T> getSpecificList(list:List<*>):List<T>{
    var specidficList= mutableListOf<T>()
      for (element in list){
          if(element is T){
              specidficList.add(element)
          }
      }
    return specidficList

}