package com.example.classes

internal class Person()
private class Human()   // class accessible within the file only.
open class User()   // class accessible within the file only.
{
    private val name="louis"  //accessible within class only.
    protected val name1="louis"  //accessible within a class and its subclasses(any class that inherits user)
}


class VipUser:User(){
    fun show(){
        println(name1)
    }
}