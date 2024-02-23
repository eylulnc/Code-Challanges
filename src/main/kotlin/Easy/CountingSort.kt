package Easy

fun countingSort(arr: Array<Int>): Array<Int> {
    // Write your code here
    var arrOfZero = Array(100) {i -> 0}
    for (i in arr.indices){
        if( arrOfZero[arr[i]] == 0 ) {
            arrOfZero[arr[i]] = arr.count { it == arr[i] }
        }
    }
    return arrOfZero
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = countingSort(arr)

    println(result.joinToString(" "))
}