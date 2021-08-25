package fundamentosKotlinCod3er.ClassesObjetos

class Filme {
    val nome: String
    val anoLancamento: Int
    val genero: String

    constructor(nome: String, anoLancamento: Int, genero: String = "Drama"){
        this.nome = nome
        this.anoLancamento = anoLancamento
        this.genero = genero
    }
}

fun main() {
    val filme = Filme("Spider-man", 2021) // genero esta defiinido como Drama caso nao seja passado
    println("${filme.nome} do genero ${filme.genero} foi lançado em ${filme.anoLancamento}")
}