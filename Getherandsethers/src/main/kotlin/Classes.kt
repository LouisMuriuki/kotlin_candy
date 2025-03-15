class User(firstName: String, var lastName: String = "Hugo", var age: Int = 25) {
    var firstName = firstName
        get() {
            return "FirstName: $field"
        }
        set(value) {
            println("$value was assigned to firstName property")
            field = value
        }
    var lastname="Louis"
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
// not allowed as lateinit does not have a backing field~field

        set(value) {
            field="Avengers"
        }

}

class Person(name:String, age:Int){
    var name=name
        get() {
            return "Name is $field"
        }
        set(value) {
            println("That changes")
            field=value
        }

    var age=age
        get() {
            return field  // this return expects a number so we can just do return The field is :$field
        }
        set(value) {
            field=age
        }
}