class User(firstName: String, var lastName: String = "Hugo", var age: Int = 25) {
    var firstName = firstName
        get() {
            return "FirstName: $field"
        }
        set(value) {
            println("$value was assigned to firstName property")
            field = value
        }
}

class Lateinit(name: String, firstName: String, lastName: String) {
    lateinit var favouriteMovie: String

}