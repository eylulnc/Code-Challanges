package WarmUp

fun plusMinus(arr: Array<Int>): Unit {
    // Write your code here
    var zero = 0.0
    var plus = 0.0
    var minus = 0.0
    for(num in arr) {
        if (num < 0) {
            minus++
        } else if (num == 0) {
            zero++
        } else {
            plus++
        }
    }
    if (arr.size != 0) {
        zero = zero / arr.size
        plus = plus / arr.size
        minus = minus/arr.size
    } else {
        zero = 0.0
        plus = 0.0
        minus = 0.0
    }

    println("%.6f".format(plus))
    println("%.6f".format(minus))
    println("%.6f".format(zero))
}

fun main(args: Array<String>) {
    val n = readln().trim().toInt()

    val arr = readln().trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    plusMinus(arr)
}