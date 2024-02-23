package WarmUp
fun timeConversion(s: String): String {
    // Write your code here
    val timeArray = s.split(":")
    var hour = timeArray[0]
    val min = timeArray[1]
    val sec = timeArray[2].dropLast(2)
    if (s.contains("AM") && hour == "12" ) {
        hour = "00"
    } else if (s.contains("PM") && hour == "12" ) {
        hour = "12"
    } else if (s.contains("PM")) {
        hour = ((hour.toInt() + 12) % 24 ).toString()
    }

    return "$hour:$min:$sec"
}

fun main(args: Array<String>) {
    println("Enter time")
    val s = readln()

    val result = timeConversion(s)

    println(result)
}