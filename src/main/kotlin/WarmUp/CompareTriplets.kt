package WarmUp

import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

fun compareTriplets(a: Array<Int>, b: Array<Int>): Array<Int> {
    var aScore = 0
    var bScore = 0
    for(i in 0..a.size-1){
        if(a[i] > b[i]){
            aScore++
        } else if( b[i] > a[i]){
            bScore++
        }
    }
    return arrayOf(aScore,bScore)
}

fun main(args: Array<String>) {

    val a = readln().trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val b = readln().trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = compareTriplets(a, b)

    println(result.joinToString(" "))
}
