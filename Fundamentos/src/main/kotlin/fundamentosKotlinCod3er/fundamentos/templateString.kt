package fundamentosKotlinCod3er.fundamentos

fun main() {
    val aprovados = listOf("Adilson", "Marcia", "Luciani")
    println("O Primeiro Aprovado foi ${aprovados[0]}")

    // Usando if como expressao
    val bomHumor: Boolean = true
    println("Hoje estou ${if(bomHumor) "feliz" else "Chateado"}")

    //Notacao potno
    val a: Int = 33.dec()
    var b: String = a.toString()

    println("Int : $a")
    println("Primeiro char da String b é: ${b.first()}")
}