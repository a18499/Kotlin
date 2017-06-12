package oo

/**
 * Created by user on 2017/5/27.
 */
open class Person(open val name:String,open var age:Int){
    init {
        println("Object is create")
    }
    fun getBirth()=2017-age

    open fun greet(){
        println("Hi ")
    }
}
class Student(override val name:String,override var age:Int): Person(name,age){
    fun classes(){
        println("Chinese")
    }

    override fun greet() {
        println("Fuck")
    }
}

fun main(args: Array<String>) {
    val student  = Student("Kobe",35)
    val age = student.getBirth()
    println(age)
    val person = Person("EE",33)

}