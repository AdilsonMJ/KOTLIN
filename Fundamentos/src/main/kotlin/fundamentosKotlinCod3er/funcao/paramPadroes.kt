package fundamentosKotlinCod3er.funcao

fun potencia(base: Int = 2, expoente: Int = 1): Int{
    return Math.pow(base.toDouble(), expoente.toDouble()).toInt()
}

fun main() {
    println(potencia(2, 3))
    println(potencia( 3))
    println(potencia(expoente = 9))
}