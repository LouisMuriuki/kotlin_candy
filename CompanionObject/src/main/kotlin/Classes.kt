class Calculator() {
    //also reffered as class variable/fns, They don't belong to an instance of the class but the whole function
    companion object {
        var max=100
        fun sum(a: Int, b: Int): Int {
            return a + b
        }
    }
}