package WarmUp

import kotlin.io.*
import kotlin.text.*

fun fizzBuzz(n: Int): Unit {
    // Write your code here
    for(i in 1..n){
        if(i%15 == 0) {
            println("FizzBuzz")
        } else if (i%5 == 0) {
            println("Buzz")
        } else if(i%3 == 0) {
            println("Fizz")
        }else {
            println(i)
        }
    }
}

fun main(args: Array<String>) {
    val n = readln().trim().toInt()

    fizzBuzz(n)
}
