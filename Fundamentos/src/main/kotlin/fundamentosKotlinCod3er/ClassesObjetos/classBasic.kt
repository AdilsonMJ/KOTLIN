package fundamentosKotlinCod3er.ClassesObjetos

 class Cliente{
     // Membros >> Membros de uma classe sao atributos e comportamentos
    var name: String = ""
 }

fun main() {
    val cliente = Cliente()
    cliente.name = "Adilson"


    print(cliente.name)
}