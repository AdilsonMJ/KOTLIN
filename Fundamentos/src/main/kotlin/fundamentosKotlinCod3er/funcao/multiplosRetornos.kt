package fundamentosKotlinCod3er.funcao
import java.util.*

data class Horario(val h: Int, val m: Int, val s: Int)

fun agora(): Horario {
    val agora = Calendar.getInstance()
    with(agora){
        return Horario(h = get(Calendar.HOUR), m = get(Calendar.MINUTE), get(Calendar.SECOND))  // Posso usar parametros nomeados
        // Kotlin sabe q get pertence a agora, se fosse fora teria q colocar agora.get()
    }
}

fun main() {
    val (h, m, s) = agora()
    println("$h:$m:$s")
}

/*
* Crio uma class para usar o destructing,  (val (h, m, s) = agora())
* whit(agora) é para nao precisar ficar colocando agora.get em todos os gets
* */

