interface Expressao


class Numero(val valor: Int) : Expressao

class Soma(val equerdo: Expressao, val direito: Expressao) : Expressao


fun avaliacao(expressao: Expressao): Int {
    if (expressao is Numero) {
        return expressao.valor
    }

    if (expressao is Soma) {
        return avaliacao(expressao.equerdo) + avaliacao(expressao.direito)
    }

    throw IllegalAccessException("Expressão desconhecida")
}

fun main() {
    //((1 + 2) + 4)
    val resultado = avaliacao(Soma(Soma(Numero(1), Numero(2)), Numero(4)))

}