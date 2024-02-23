package Easy

import kotlin.math.absoluteValue


fun diagonalDifference(arr: Array<Array<Int>>): Int {
    // Write your code here
    var count = arr.size-1
    var diagonal1= 0
    var diagonal2 = 0
    for (i in arr.indices) {
        diagonal1 += arr[i][i]
        diagonal2 += arr[i][count]
        count--
    }
    return (diagonal1 - diagonal2).absoluteValue

}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = Array<Array<Int>>(n) { Array<Int>(n, { 0 }) }

    for (i in 0..<n) {
        arr[i] = readln().trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    }

    val result = diagonalDifference(arr)

    println(result)
}