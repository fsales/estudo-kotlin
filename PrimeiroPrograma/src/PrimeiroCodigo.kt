fun main(args: Array<String>) {
    println(max(1, 2))
    println(maxSimplificada(1, 2))

    // string template
    val nome: String  = "Casa"

    println("Hello $nome!")

    // string templete expressão
    println("Soma é: ${soma(1 , 2)} ")
}

fun soma(a:Int, b: Int) = a +b

// estrutura básica de uma função (corpo de bloco)
fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}

// simplificando a função (corpo de expressão)
fun maxSimplificada(a: Int, b: Int): Int = if (a > b) a else b
