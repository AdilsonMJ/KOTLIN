package fundamentosKotlinCod3er.ClassesObjetos

class Calculadora{
    private var resultado: Int = 0
    fun somar(vararg valores: Int): Calculadora{
        valores.forEach { resultado += it }
        return this // Retorna o objeto atual
    }

    fun multiplicar(valor: Int): Calculadora{
        resultado *= valor
        return this
    }

    fun limpar(): Calculadora{
        resultado = 0
        return this
    }

    fun print(): Calculadora{
        println(resultado)
        return this
    }


    fun obterResultado(): Int{
        return resultado
    }

}

fun main() {
    val calculadora = Calculadora()
    calculadora.somar(1,5,2,4,5,2,2).multiplicar(3).print() // Encadeamento de chamado
    calculadora.somar(7,10).print().limpar()
}