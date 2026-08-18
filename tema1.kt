//1
fun main() {
    val name = "Mary"
    val age = 20
    println("$name is $age years old")
    
}
//2
fun main() {
    val a: Int = 1000 
    val b: String = "log message"
    val c: Double= 3.14
    val d:Long = 100_000_000_000_000
    val e: Boolean = false
    val f:Char = '\n'
}
//3.1
fun main() {
    val greenNumbers = listOf(1, 4, 23)
    val redNumbers = listOf(17, 2)
    
    val total=(greenNumbers.count()+redNumbers.count())
    println(total)
}
//3.2
fun main() {
    val SUPPORTED = setOf("HTTP", "HTTPS", "FTP")
    val requested = "smtp"
    val isSupported = requested in SUPPORTED
    println("Support for $requested: $isSupported")
}
//3.3
fun main() {
    val number2word = mapOf(1 to "one",2 to "two", 3 to "three")
    val n = 2
   	println("$n is spelled as '${number2word[n]}'")
}

