fun main() {
    var temperatura : Int = 0
    var somatorio : Int =0
    var quantidade: Int =0

    while (temperatura != 999){
        println("digite uma temperatura ou 999 para sair.")
        readLine()?.let {
            temperatura = it.toInt()

            if (temperatura != 999){
                somatorio += temperatura
                quantidade++
            }
        }

    }

    println("a média das temperatura é = ${somatorio/quantidade}")
}