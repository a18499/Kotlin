package challenge

import java.util.*

/**
 * Created by a1849 on 2017/5/20.
 */
fun main(args: Array<String>) {
    var Randoms: Int =Random().nextInt(50)
    when (Randoms){
       in 1..10 -> println("Randoms is between 1 -10 Random is :"+Randoms)
       in 11..20 ->  println("Randoms is between 11 -20 Random is :"+Randoms)
       in 21..30 ->  println("Randoms is between 21 -30 Random is :"+Randoms)
       in 31..40 ->  println("Randoms is between 31 -40 Random is :"+Randoms)
        !in 1..40 -> println("Randoms is above 40 Random is :"+Randoms)
    }
}