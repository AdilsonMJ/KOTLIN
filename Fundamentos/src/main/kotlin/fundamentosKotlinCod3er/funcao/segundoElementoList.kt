package fundamentosKotlinCod3er.funcao

// E de Generico e quando for inicializar informa qual tipo vai ser
fun <E> List<E>.secondOrNull(): E?  = if(this.size >= 2) this.get(1) else null

//List a = ...   Pode colocar qualquer coisa
// List<String> s = ... Essa list so pode ter elementos String
// List<Int> notas = ... Essa list so pode ter elementos Inteiros

// Peguei a list que é da api e criei um metodo dentro de list
//List é heterogenea ela pode ter qualquer dados dentro de uma list.
//

fun main() {
    val lista = listOf("Luciani","Shakira","Gal")
    println(lista.secondOrNull())
}