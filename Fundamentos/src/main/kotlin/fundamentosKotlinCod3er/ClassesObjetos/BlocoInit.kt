package fundamentosKotlinCod3er.ClassesObjetos

class  Filme3(nome: String, ano: Int, genero: String){
    val nome: String
    val ano: Int
    val genero: String

    init{
        this.nome = nome
        this.ano = ano
        this.genero = genero
    }
}


fun main() {
    val filme = Filme3("Spider-man", 2021, "Drama")
    println("${filme.nome} do genero ${filme.genero} foi lançado em ${filme.ano}")
}