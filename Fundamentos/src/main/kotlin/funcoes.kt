fun main() {

    //case 1
    println(calcular1("somar", 3,5))

    //case 2
     calcular2("mutiplicar", 3,5)
}

// case: 1 >> Por usar retorno implicito (: Int), tenho que definir return em tudo
fun calcular1(a: String, b: Int, c: Int): Int {
    return when (a) {
        "somar" -> return (b + c)
        "subtrair" -> return (b - c)
        "mutiplicar" -> return (b * c)
        "divisao" -> return (b / c)
        else -> return(404)
    }
}


// case: 2 >> Por NAO usar retorno implicito (: Int), DEVO USAR PRINT
    fun calcular2(a: String, b: Int, c: Int) {
         when (a) {
            "somar" -> print (b + c)
            "subtrair" -> print (b - c)
            "mutiplicar" -> print (b * c)
            "divisao" -> print (b / c)
            else -> print(404)
        }
    }


