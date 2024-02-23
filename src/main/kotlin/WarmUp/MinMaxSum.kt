package WarmUp

fun miniMaxSum(arr: Array<Int>) {
    // Write your code here
    var temp  = arr.map { it.toLong() }.toLongArray()
    val res: ArrayList<Long>  = arrayListOf()
    for (element in arr){
        val sum = temp.sum() - element
        res.add(sum)
    }
    print("${res.min()} ${res.max()}")
}

fun main(args: Array<String>) {

    val arr = readln().trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    miniMaxSum(arr)
}