package fundamentosKotlinCod3er.fundamentos

fun imprimirConceito(nota: Any){
    when(nota as? Int){
        10, 9 -> println("A")
        8, 7 -> println("B")
        6, 5 -> println("C")
        4, 3 -> println("D")
        2, 1, 0 -> println("E")
        else -> print("Nota invalida")
    }
}

fun main() {
    val notas = arrayOf(8.1, 3.2, 8.9)
    for (x in notas){
        imprimirConceito(x.toInt())
    }
}


/*
* Definir nota sendo do tipo Any, porem no controle when uso o "as" para informa que quero trabalhar com nota sendo um Int
* Solucoes:
*   1) Posso adicionar o ? na frente do as (as?) para torna ele opcional, ele vai retorna nul sem da erro.
*   2) tambem passar nota para int com toint.   imprimirConceito(x.toInt())
*   3) Posso colocar um valor padrao para valores null, as? Int ?: 10
* */