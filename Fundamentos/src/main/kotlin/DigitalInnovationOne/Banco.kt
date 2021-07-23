package DigitalInnovationOne

data class Banco(
    //Propriedades
    val nome: String,
    val numero: Int
){
    fun info() = "nome: $nome    numero: $numero "
}
