package Easy

/*
 * Complete the 'lonelyinteger' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER_ARRAY a as parameter.
 */

fun lonelyinteger(a: Array<Int>): Int {
    // Write your code here
    var nums = a.toList()
    nums =  nums.filter { item -> nums.count { it == item } <= 1 }
    return  nums.get(0)
}

fun main(args: Array<String>) {
    val n = readln().trim().toInt()

    val a = readln().trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = lonelyinteger(a)

    println(result)
}
