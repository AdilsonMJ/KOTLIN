package fundamentosKotlinCod3er.funcao

/*
* Sempre começa com inline, parametro sempre uma funcao, nesse caso nao recebe nada e retorna um unit que seria um void, sem retorno.
* Dentro da funcao inline defini as ordens.
* Primeira coisa abrir um priintln, abri um try que chama a funcao.
* no finally sempre vou usar para fechar transacao mesmo que de erro, pois ela n pode ficar aberta.
* Entretando finally é opcional
* */

inline fun transacao(funcao: () -> Unit){
    println("abrindo transacao")
    try{
        funcao()
    } finally {
        println("Fechar transacao")
    }
}

fun main() {
    //Essa é a forma mais basica da funcao inline, chama e ja abri {}, entretando se necessario posso passar parametros (...)
    transacao {
        println("Executando SQL 1 ...")
        println("Executando SQL 2 ...")
        println("Executando SQL 3 ...")
        println("Executando SQL 4 ...")
    }
}

/*
*   abrindo transacao
    Executando SQL 1 ...
    Executando SQL 2 ...
    Executando SQL 3 ...
    Executando SQL 4 ...
    Fechar transacao
* */