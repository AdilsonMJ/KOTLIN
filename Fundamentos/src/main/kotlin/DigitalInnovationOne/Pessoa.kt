package DigitalInnovationOne

class Pessoa {
    var nome: String = "Adilson"
    var cpf: String = "222.233.455-98"
        private set

    constructor()

    fun uneNomeCpf() = "$nome e $cpf"
}

fun main() {
    val adilson: Pessoa = Pessoa()


    adilson.nome = "Luciani"
    println(adilson.uneNomeCpf())
}