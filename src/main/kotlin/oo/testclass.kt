package oo

/**
 * Created by user on 2017/5/27.
 */
class Car  (val name: String, val speed: Int){
    fun print(){
        println("$name $speed")
    }
}

fun main(args: Array<String>) {
    val car:Car = Car("toyota",100)
    println(car.name+" "+car.speed)
    car.print()
}