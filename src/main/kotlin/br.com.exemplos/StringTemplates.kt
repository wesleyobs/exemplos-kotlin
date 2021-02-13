fun main() {
    val nome = "Wesley"
    println("Hello $nome!")
    println("Hello ${soma(10, 10)}")
}

fun soma(a: Int, b: Int): Int {
    return a + b;
}