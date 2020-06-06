class Pessoa(
    val nome: String,
    val idade: Int
)

fun main(){
    val pessoa = Pessoa("Fábio",16)

    println("Nome: ${pessoa.nome} - idade: ${pessoa.idade}")
}