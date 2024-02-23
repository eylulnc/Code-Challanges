package WarmUp

fun staircase(n: Int) {
    // Write your code here
    var sq = 1
    var step = 1
    while(sq <= n) {
        if(step <= n-sq) {
            print(" ")
        } else {
            print("#")
        }

        if (step == n) {
            println()
            sq++
            step = 0
        }
        step++
    }
}
fun main(args: Array<String>) {
    val n = readln().trim().toInt()

    staircase(n)
}