package fundamentosKotlinCod3er.ClassesObjetos

class Data(var dia: Int, var mes: Int, var ano: Int){
    // formatar nao precisa de receber nenhum atributo pois a dona dela é a class Data e dentro dela ja tem as informacoes que
    // vai precisar para formatar.
    fun formatar(): String {
        return "$dia/$mes/$ano"
    }
}

fun main() {
    var nascimento: Data = Data(dia = 10, mes = 10, ano = 2021)

    println("${nascimento.dia} / ${nascimento.mes}  / ${nascimento.ano}")
    //funcao inline
    with(nascimento) { println("${dia}/${mes}/${ano}")}

    println(nascimento.formatar())
}