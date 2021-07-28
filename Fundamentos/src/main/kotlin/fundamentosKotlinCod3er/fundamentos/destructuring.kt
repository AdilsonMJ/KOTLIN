package fundamentosKotlinCod3er.fundamentos

data class Carro(val marca: String, val modelo: String)

fun main() {
    val (marca, modelo) = Carro (marca = "FIAT", modelo = "500")
    println("$marca, $modelo")

    val (marido, mulher) = listOf("Adilson", "Luciani")
    println("$marido, $mulher")

    val (_,_, terceiro) = listOf("Kimi", "Hamilton", "Alonso")
    println(terceiro)

}


/*
* Posso tirar um valor de dentro de uma class, nesse caso ja tirei variaveis salvando os dados.
* Posso tirar tambem objetos de dentro de uma lista
* Para ignora algum item pode se usar o _  EX: _,_, terceiro
* Ele sempre vai pegar na sequencia.
* */