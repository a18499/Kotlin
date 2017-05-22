package collection

/**
 * Created by user on 2017/5/21.
 */

fun main(args: Array<String>) {
    var arraylist = arrayListOf<String>()
    arraylist.add("Test")
    arraylist.add("Test1")
    arraylist.add("Test2")
    println(arraylist.contains("Test"))
    if(arraylist.contains("Test")){
        println("there has test in list")
    }
    for (String  in arraylist){
        println(String)
    }
}