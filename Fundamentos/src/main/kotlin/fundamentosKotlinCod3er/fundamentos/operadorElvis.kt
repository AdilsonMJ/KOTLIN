package fundamentosKotlinCod3er.fundamentos

fun main() {
    val opcional: String? = null
    val obrigatoria: String = opcional ?: "Valor Padrao"
}

/*
* Quando se declara vaariavel apenas com a: String, ela se torna obrigatoria ter um valor,
* por esse motivo no exemplo a cima nao posso passar opcional dentro da obrigatoria pois a opcional pode estar vazia.
* Uma forma de concerta isso é colocando o operador elvis (:?) seguido do valor padrao.
* EX: val obrigatoria: String = opcional ?: "Valor Padrao"
*  ## Valor padrao somente se nada for passado na opcional, sem isso da erro! ##
 */