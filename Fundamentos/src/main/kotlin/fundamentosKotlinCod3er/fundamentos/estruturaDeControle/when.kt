package fundamentosKotlinCod3er.fundamentos.estruturaDeControle

fun main() {
    val nota = 3

    when(nota){
        10, 9 -> println("Aprovado!!! Incrivel")
        8, 7 -> println("Aprovado")
        6, 5, 4 -> println("Recuperacao")
        in 0..3 -> println("Reprovado BURRO") // Operador range dentro de when
        else -> println("Nota invalida")
        }
}