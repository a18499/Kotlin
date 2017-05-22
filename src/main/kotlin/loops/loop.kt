package loops

/**
 * Created by user on 2017/5/22.
 */

fun main(args: Array<String>) {
    val list =  listOf("TEst","TTTT","YYYY")
    for(i in 1 ..10){
        println("TTTT $i")
    }
    for (element in list){
        println(element)
    }
    for((index,value)in list.withIndex()){
        println("Element is $value index is $index")
    }
}