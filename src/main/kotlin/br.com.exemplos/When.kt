import br.com.exemplos.Cor

//expressão
fun obterMnemonica(cor: Cor): String =
    when (cor) {
        Cor.VERMELHO -> "Ver"
        Cor.AMARELO -> "Alguém"
        Cor.VERDE -> "Viver"
        Cor.AZUL -> "Além é"
        Cor.LARANJA -> "Legal"
    }

//bloco
fun obterTemperatura(cor: Cor): String {
    return when (cor) {
        Cor.VERMELHO, Cor.LARANJA, Cor.AMARELO -> "Quente"
        Cor.VERDE -> "Neutro"
        Cor.AZUL -> "Frio "
    }
}

fun main() {
    println("Mnemonica ${obterMnemonica(Cor.LARANJA)}")
    println("Temperatura ${obterTemperatura(Cor.VERMELHO)}")
}