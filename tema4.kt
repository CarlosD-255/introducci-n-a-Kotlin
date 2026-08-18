//4.1
import kotlin.random.Random

fun main() {
    val firstResult = Random.nextInt(6)
    val secondResult = Random.nextInt(6)
    if(firstResult==secondResult)
    	println("you win")
    else
    	println("you loose")
     
}
//4.2
fun main() {
    val button = "A"
	println(
        when (button) {
            "A" -> "Yes"
            "B" -> "No"
            "X" -> "Menu"
            "Y" -> "Nothing"
            else -> "There is no such button"
        }
    )
}
//4.3
fun main() {
    var pizzaSlices = 0
    while (pizzaSlices<7){
    pizzaSlices++
    println("There's only $pizzaSlices slice/s of pizza :(")
    
	}
    pizzaSlices++
    println("There are $pizzaSlices slices of pizza. Hooray! We have a whole pizza! :D")
}
//4.4
fun main() {
    for (number in 1..100) {
        println(
            when {
                number % 15 == 0 -> "fizzbuzz"
                number % 3 == 0 -> "fizz"
                number % 5 == 0 -> "buzz"
                else -> "$number"
            })}}
//4.5

fun main() {
    val words = listOf("dinosaur", "limousine", "magazine", "language")
      for (w in words) {
        if (w.startsWith("l"))
            println(w)
            
    }
}
