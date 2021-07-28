package fundamentosKotlinCod3er.fundamentos

/*
        ##   Funcao Padrao ##
 Entrada (params) -> Processamento (funcao) -> Saida (return)
 fun nomeFuncao(param: Tipo): tipoRetorno{}

        ##   Funcao sem entrada  ##
    Processamento (funcao) -> Saida (return)
 fun nomeFuncao(): tipoRetorno{}

        ##   Funcao sem returno  ##
  Entrada (params) -> Processamento (funcao)
 fun nomeFuncao(param: Tipo){}

         ##   Funcao sem entrada e returno  ##
Processamento (funcao)
 fun nomeFuncao(){}
*/


// Funcao sem Retorno
fun sub(a: Int, b: Int){
    println(a + b)
}

// ########################################################################//

//Funcao com Retorno
fun soma(a: Int, b: Int = 1): Int{
    return a + b
}

/*
* fun soma(a: Int, b: Int = 1) >>> Parametro padrao, caso nada seja passado o parametro b ira assumir 1.  EX: println(soma(4))   -  output 5
* print(soma(a=3,b=3))  >>> Estou forçando/Informando qual parametro pertence esse dado, se nao colocar nada ele vai assumir por padrao na ordem,
* dessa forma posso mudar a ordem da declaracao EX: print(soma(b=3, a=3)) Resultado sera o mesmo
* */

fun main() {
    // Funcoes com retorno
    println(soma(4))
    println(soma(a=3,b=3))


}