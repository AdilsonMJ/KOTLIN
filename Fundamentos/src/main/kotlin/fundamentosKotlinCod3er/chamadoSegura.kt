package fundamentosKotlinCod3er

fun main() {
    var a: Int? = null   // Safe call operator
    println(a?.dec())
}

/*
* Forma de força o kotlin a retorna null e nao jogar um erro.
* */
