import java.util.*

fun fizBuzz(numero: Int) = when {
    numero % 15 == 0 -> "FizzBuzz"
    numero % 3 == 0 -> "Fizz"
    numero % 5 == 0 -> "Buzz"
    else -> "$numero"
}

fun main() {
    for (numero in 1..100) {
        val resul = fizBuzz(numero)
        println(resul)
    }


    //estrutura de dados map
    val binaryRepresentation = TreeMap<Char, String>()

    for (c in 'A'..'F') {
        val binary = Integer.toBinaryString(c.toInt())
        binaryRepresentation[c] = binary
    }

    for((letter, binary) in binaryRepresentation){
        println("$letter - $binary")
    }

}