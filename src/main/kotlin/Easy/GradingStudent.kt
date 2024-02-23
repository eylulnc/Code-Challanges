package Easy

import kotlin.collections.*
import kotlin.io.*
import kotlin.ranges.*
import kotlin.text.*

/*
 * Complete the 'gradingStudents' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts INTEGER_ARRAY grades as parameter.
 */

fun gradingStudents(grades: Array<Int>): Array<Int> {
    // Write your code here
    for (i in 0..grades.size-1){
    if(grades[i] >= 38) {
        var distance = roundToNearestUpperMultipleOf5(grades[i]) - grades[i]
        if (distance < 3){
            grades[i] = roundToNearestUpperMultipleOf5(grades[i])
            }
        }
    }
    return grades
}

fun roundToNearestUpperMultipleOf5(number: Int): Int {
    val remainder = number % 5
    return if (remainder == 0) {
        number // Already a multiple of 5
    } else {
        number + (5 - remainder)
    }
}

fun main(args: Array<String>) {
    val gradesCount = readLine()!!.trim().toInt()

    val grades = Array<Int>(gradesCount, { 0 })
    for (i in 0 until gradesCount) {
        val gradesItem = readLine()!!.trim().toInt()
        grades[i] = gradesItem
    }

    val result = gradingStudents(grades)

    println(result.joinToString("\n"))
}
