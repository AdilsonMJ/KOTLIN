package fundamentosKotlinCod3er.funcao

import kotlin.math.min

/*
* fun main(a: Int, b: Int): Int{
    return if(a < b) a else b
}
* */
fun main(a: Int, b: Int): Int = if(a < b) a else b

fun main() {
    print("O menor valor é ${min(a= 4, b = 6)}")
}