package br.com.exemplos

enum class Cor(val red: Int, val green: Int, val blue: Int) {
    VERMELHO(255, 0, 0),
    LARANJA(255, 165, 0),
    AMARELO(255, 255, 0),
    VERDE(0, 255, 0),
    AZUL(0, 0, 255);

    /**Funcao acessor customizado*/
//    val rgb: Int
//        get() = ((red * 256 + green) * 256 + blue)

    fun rgb() = ((red * 256 + green) * 256 + blue)
}

fun main() {
    val rgb = Cor.AMARELO.rgb()
    println(rgb)
}