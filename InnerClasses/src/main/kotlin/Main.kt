//
// inner classes are classes declared within another class-very close relationship between the classes
// first create the parent object then call the inner class
fun main() {
    val listview = ListView(arrayOf("Name1", "Name2", "Name3", "Name4", "Name5"))

    listview.ListViewItem().displayItem(2)

}

class ListView(val items: Array<String>) {

    inner class ListViewItem() {  // have access to outer class properties
        fun displayItem(position: Int) {
            println(items[position])
        }
    }

}