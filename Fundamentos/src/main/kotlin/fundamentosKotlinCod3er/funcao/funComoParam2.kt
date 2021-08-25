package fundamentosKotlinCod3er.funcao

/*
* Criei uma funcao filtra que recebe uma lista do tipo String e uma funcao do tipo String que retorna um boolean, essa funcao vai retorna uma lista do tipo String.
* Crio uma lista nova sem nada para salvar os dados.
* for para percorre a lista que recebi no primeiro parametro.
* if para passar o objeto atual dentro do filtro recebido no segundo parametro.
* */

fun filtrar(lista: List<String>, filtro: (String) -> Boolean): List<String>{
    val listaFiltrada = ArrayList<String>()
    for (e in lista){
        if (filtro(e)){
            listaFiltrada.add(e)
        }
    }
    return listaFiltrada
}

fun comTresLetras(nome: String): Boolean{
    return nome.length == 3
}
fun main() {
    val nome = listOf("lex", "Bia", " Ana", " Luciani","Bruno"," Gi")
    println(filtrar(nome, ::comTresLetras))
}