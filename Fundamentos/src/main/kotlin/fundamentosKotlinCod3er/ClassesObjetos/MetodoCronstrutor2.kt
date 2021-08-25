package fundamentosKotlinCod3er.ClassesObjetos

class Filme2(val nome: String, val ano: Int, val genero: String = "Desconhecido")

fun main() {
    val filme = Filme2("Spider-man", 2021) // genero esta defiinido como Drama caso nao seja passado
    println("${filme.nome} do genero ${filme.genero} foi lançado em ${filme.ano}")
}