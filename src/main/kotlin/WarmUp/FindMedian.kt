package WarmUp

fun findMedian(arr: Array<Int>): Int {
    // Write your code here
    arr.sort()
    if(arr.size % 2 == 0) {
        val index = arr.size/2
        val sum = (arr[index] + arr[index+1])/2
        return sum

    } else {
        return arr[arr.size/2]
    }

}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = findMedian(arr)

    println(result)
}
