package fundamentosKotlinCod3er.funcao

class Produto(val nome: String, val preco: Double)

infix fun Produto.maisCaroQue(produto: Produto): Boolean = this.preco > produto.preco

fun main() {
    val p1 = Produto("Ipad", 184.99)
    val p2 = Produto(preco = 499.99, nome = "Xiomi")

    println(p1 maisCaroQue p2)
    println(p2.maisCaroQue(p1))
}