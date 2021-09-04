package fundamentosKotlinCod3er.ClassesObjetos

class Cliente2{
    constructor(nome: String){
        this.nome = nome
    }
    var nome: String
        get() = "Meu nome é ${field}"
        set(value){
            field = value.takeIf { value.isNotEmpty() } ?: "Anonimo"
        }
}

fun main() {
    val c1 = Cliente2("")
    println(c1.nome)

    val c2 = Cliente2("Adilson")
    println(c2.nome)
}