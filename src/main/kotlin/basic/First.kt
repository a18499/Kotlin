package basic

/**
 * Created by user on 2017/5/21.
 */

fun main(args: Array<String>) {
    println("Test My kotlin")
    var logger: String
    logger = "Test"
    println(logger)
    var mode: Int = 15
    when (mode) {
        1 -> println("This is mode 1")
        15 -> println("This is mode " + mode)
    }
}