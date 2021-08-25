package fundamentosKotlinCod3er.ClassesObjetos

val diretamenteNoArquivo = "Bom dia" // Definindando variavel fora de uma classe

//Criando variavel topLevel fora de uma class
fun topLevel(){
    val local = "Fulano"
    println("$diretamenteNoArquivo $local")
}

class Coisa{
    var variavelDeInstancia: String = "Boa noite"

    companion object{
        @JvmStatic val constanteDeClasse = "Ciclano" //@JvmStatic somente se for preciso acessar essa varivel usando java
    }

    fun fazer(){
        val local: Int = 7

        if(local > 3 ){
            val variavelDeBloco = "PQP"
            println("$variavelDeInstancia, $constanteDeClasse, $local e $variavelDeBloco")
        }
    }
}

fun main() {
    topLevel()
    Coisa().fazer() // Criando a instancia sem atribuir a nenhuma variavel.
    println(Coisa.constanteDeClasse) // Nao precisar criar a instancia de class
}
