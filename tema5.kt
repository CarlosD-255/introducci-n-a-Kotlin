//5.1
import kotlin.math.PI

fun circleArea(radius: Int): Double{
    var area=PI*radius*radius
    return area
}
fun main() {
    println(circleArea(2))
}

//5.2
import kotlin.math.PI

fun circleArea(radius: Int): Double=PI*radius*radius
// Write your code here

fun main() {
    println(circleArea(2))
}

//5.3
fun intervalInSeconds(hours: Int=0, minutes: Int=0, seconds: Int=0) =
    ((hours * 60) + minutes) * 60 + seconds

fun main() {
    println(intervalInSeconds(1, 20, 15))
    println(intervalInSeconds(0, 1, 25))
    println(intervalInSeconds(2, 0, 0))
    println(intervalInSeconds(0, 10, 0))
    println(intervalInSeconds(1, 0, 1))
}
