package algorithm

/**
 * Created by a1849 on 2017/6/12.
 */
class quicksort {
    var beforeSortArray : Array<Int> = arrayOf()

    fun init(arrays:Array<Int>){
        beforeSortArray = arrays
    }
    fun sortIt():Array<Int>{
        beforeSortArray
        println("Input data: First "+beforeSortArray[0]+" Last:"+beforeSortArray[(beforeSortArray.size-1)])
        quicksorting(0,beforeSortArray.size-1)
        return beforeSortArray
    }
    fun quicksorting(left:Int,right:Int){
        var Left:Int
        var Right:Int
        var base:Int
        Left = left
        Right =right
        if (Left>Right){
            return
        }
        base = beforeSortArray[Left]

        while (Left!=Right){
            while (base<=beforeSortArray[Right]&&(Left<Right))
                Right--

            while (base>=beforeSortArray[Left]&&(Left<Right))
                Left++

            if(Left<Right){
                var tempvalue:Int
                tempvalue = beforeSortArray[Left]
                beforeSortArray[Left]=beforeSortArray[Right]
                beforeSortArray[Right]=tempvalue
            }
        }

        beforeSortArray[left]=beforeSortArray[Left]
        beforeSortArray[Left]=base
        quicksorting(left,Left-1)
        quicksorting(Left+1,right)

    }
}

fun main(args: Array<String>) {
    var testarray:Array<Int> = arrayOf(5,1,6,4,7,95,2,8,45)
    var testquick:quicksort= quicksort()
    testquick.init(testarray)

    var result = testquick.sortIt()
    result.forEach { print(" $it") }
}