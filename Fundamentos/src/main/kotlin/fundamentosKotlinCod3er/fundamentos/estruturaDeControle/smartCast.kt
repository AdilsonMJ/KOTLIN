package fundamentosKotlinCod3er.fundamentos.estruturaDeControle

fun souSmart(x: Any){
    if(x is String){
        println(x.uppercase())
    } else if(x is Int){
        println(x.plus(5))
    }
}

fun ImSmart(x: Any){
    when(x){
        is String -> println(x.uppercase())
        is Int -> println(x.plus(5))
        else -> print("Invalido")
    }
}

fun main() {
    souSmart(5)
    souSmart("Eai")

    ImSmart(45)
    ImSmart("Cole zim")
    ImSmart(true)
}