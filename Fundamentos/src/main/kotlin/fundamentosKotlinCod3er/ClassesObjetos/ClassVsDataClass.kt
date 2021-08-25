package fundamentosKotlinCod3er.ClassesObjetos

class Geladeira(val marca: String, val litros: Int)
data class Televisao(val marca: String, val polegadas: Int)

fun main() {
    val g1 = Geladeira(marca = "Brastemp", litros = 500)
    val g2 = Geladeira(marca = "Brastemp", litros = 500)

    val t1 = Televisao(marca = "Sony", polegadas = 53)
    val t2 = Televisao(marca = "Sony", polegadas = 53)

    print(g1 == g2) // tem o equals porem nao é imprementado entao aqui é como se fosse === referencia de memoria
    print(t1 == t2) // Aqui ja funciona pois é uma data class
    println(t1.toString()) // Data Class ja tem toString
    println(t2.copy()) // retorna uma copia do objeto, otimo para objetos baseados em val, podemos criar copias sem mexer no original
    println(t2.copy(polegadas = 60))

    // Destructuring em data class
    val (marca, pol) = t1
    println("$marca $pol")
}