package fundamentosKotlinCod3er.funcao

// Vou passar argumentos/parametros variaveis que serao convertidos em um array de inteiros
fun ordenar(vararg numeros: Int): IntArray{
    return numeros.sortedArray()
}

fun main() {
    for(n in ordenar(5,4,5,8,6,2,5,4,7,88,5,44,2,54,56,59,25,24,28,23,3,53,65,68,61,63)){
        print("$n  ")
    }
}