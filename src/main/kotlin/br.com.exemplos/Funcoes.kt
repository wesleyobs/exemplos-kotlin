fun main() {
    println(maxCorpoBloco(10, 5))
    println(maxCorpoExpressao(5, 11))
}

// Corpo de bloco
fun maxCorpoBloco(a: Int, b: Int): Int {
    return if (a > b) return a else b
}

//Corpo de expressao
fun maxCorpoExpressao(a: Int, b: Int): Int = if (a > b) a else b


