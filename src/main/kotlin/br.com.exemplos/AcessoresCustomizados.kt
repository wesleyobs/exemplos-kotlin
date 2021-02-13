
class Retangulo(val altura: Int, val largura: Int) {

    val isQuadrado1: Boolean
        get() = this.altura == this.largura

    fun isQuadrado2(): Boolean{
        return this.altura == this.largura;
    }
}

fun main(){
    val retangulo: Retangulo = Retangulo(10, 10)

    println("Resultado1 ${retangulo.isQuadrado1}")
    println("Resultado2 ${retangulo.isQuadrado2()}")
}