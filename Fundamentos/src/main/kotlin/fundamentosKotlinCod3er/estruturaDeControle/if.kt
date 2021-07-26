package fundamentosKotlinCod3er.estruturaDeControle

fun main() {
    val nota: Double = 6.5
    //if e Else usando operador range
    if(nota in 9.0..10.0){
        println("Aprovado!!! Incrivel")
    } else if(nota in 7.0..8.9){
    println("Aprovado")
    } else if(nota in 4.0..6.9){
        println("Recuperacao")
    } else if(nota in 0.0..3.9){
        println("Reprovado")
    } else{
        println("Reprovado BURRO")
    }


    // If e Else como Expressao
    val num1 = 2
    val num2 = 3

    val maiorValor = if (num1 > num2) {
        println("Processando....")
        num1   //*1
    } else{
        println("Processando...")
        num2  //*2
    }
    println("O maior valor é  $maiorValor")

    //Forma simplificada
    val maiorValor2 = if (num1 > num2) num1 else num2
    println("O maior valor2 é $maiorValor2")



}

/*
* Se if for simples so com uma linha de comando, posso ocultar a {}
* *1 *2 Em uma expressao com if, nao preciso colocar return na ultima linha.
* */