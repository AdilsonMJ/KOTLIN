package fundamentosKotlinCod3er.fundamentos.estruturaDeControle

fun main() {
    var opcao: Int = 0

    do{
        val line = readLine() ?: "0"
        opcao = line.toIntOrNull() ?: 0
        println("Voce escolheu a opçao $opcao")
    } while(opcao != -1)
        println("Ate a proxima")

}