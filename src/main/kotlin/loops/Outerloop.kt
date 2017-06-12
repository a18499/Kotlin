package loops

/**
 * Created by user on 2017/6/8.
 */
class Outerloop {
    fun main(){
        outer@ for(i in 1 ..10){
            for(j in 1..10) {
                break@outer
            }
        }
    }
}