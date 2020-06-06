class Retangulo(val altura: Int, val largura: Int) {
    val isQuadrado get() = altura == largura
}

fun main() {
    val retangulo = Retangulo(10 , 10)
    println(retangulo.isQuadrado)
}