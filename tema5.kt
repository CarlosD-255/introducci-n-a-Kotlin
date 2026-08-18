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
//5.4
fun main() {
    val actions = listOf("title", "year", "author")
    val prefix = "https://example.com/book-info"
    val id = 5
    val urls = actions.map { action -> "$prefix/$id/$action" }
    println(urls)
}
//5.5
fun repeatN(n: Int, action: () -> Unit) {
    for (i in 1..n) {
        action()
    }
}
fun main() {
    repeatN(5) {
        println("Hello")
    }
}
