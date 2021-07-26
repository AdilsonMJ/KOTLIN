package fundamentosKotlinCod3er.estruturaDeControle

fun main() {
    // for range
    for (i in 1..10)
        print("  $i")
        println("  Fim 1 a 10")


    for(i in 10 downTo 1)
        print("  $i")
        println("  Fim downTo 10 a 1 ")


    for(i in 0..100 step 5)
        print("  $i")
        println("  Fim step 5 ")

    for(i in 100 downTo 0 step 5)
        print("  $i")
        println("  Fim downTo 100 a 0 step 5 ")

    val alunos = arrayListOf("Adilson", "Marcos", "Fabio", "Luciani")
    for ((indice, aluno) in alunos.withIndex()){
        println("${indice + 1}  -  $aluno")
    }
}

/*  OUTPUT
*  1  2  3  4  5  6  7  8  9  10  Fim 1 a 10
*  10  9  8  7  6  5  4  3  2  1  Fim downTo 10 a 1
*  0  5  10  15  20  25  30  35  40  45  50  55  60  65  70  75  80  85  90  95  100  Fim step 5
*  100  95  90  85  80  75  70  65  60  55  50  45  40  35  30  25  20  15  10  5  0  Fim downTo 100 a 0 step 5
*
* 1  -  Adilson
* 2  -  Marcos
* 3  -  Fabio
* 4  -  Luciani
*
* */