class Pessoa(
    val nome: String,
    val idade: Int
)

fun main(){
    val pessoa: Pessoa = Pessoa("Wesley", 32)
    println("Pessoa 1 ${pessoa.nome}, idade ${pessoa.idade}")
}