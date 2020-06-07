import java.io.BufferedReader
import java.io.File
import java.io.FileReader

fun main() {
  //  porcentagem(500)

    print(lerIdade())
}

fun lerIdade(): Int? {
    val reader = FileReader(File("src/idades.txt"))
    val buffer = BufferedReader(reader)

    try {
        val numero = buffer.readLine()
        return Integer.parseInt(numero)
    } catch (e: NumberFormatException) {
        return null
    } finally {
        reader.close()
        buffer.close()
    }

}

fun porcentagem(numero: Int): String {

    return if (numero in 1..100) "$numero"
    else throw IllegalArgumentException("o número deve está entre 1 é 100")
}