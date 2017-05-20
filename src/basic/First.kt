package basic

/**
 * Created by a1849 on 2017/5/20.
 */

fun main(args: Array<String>) {
    println("Test My kotlin")
    var logger: String
    logger = "Test"
    println(logger)
    var mode: Int=15
    when (mode){
        1-> println("This is mode 1")
        15 -> println("This is mode "+mode)
    }

}
