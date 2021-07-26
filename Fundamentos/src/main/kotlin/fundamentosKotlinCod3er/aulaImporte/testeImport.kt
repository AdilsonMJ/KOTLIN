package fundamentosKotlinCod3er.aulaImporte

import fundamentosKotlinCod3er.aulaImporte.pacoteA.Coisa                        // Aqui nao se usa "as" pq eu nao quero mudar nome
import fundamentosKotlinCod3er.aulaImporte.pacoteA.FaceMoeda.CARA           // Exporte apenas um elementro da enum
import fundamentosKotlinCod3er.aulaImporte.pacoteB.*                            // Usa o * para importa tudo de dentro do pacote

/*
* Println se encontra dentro de um pacote que é exportado por padrao, pacote kotlin.io.*
* kotlin.io.println("Eai") // Acessando println diretamente dentro do pacote kotlin
* */

fun main() {
    val coisa = Coisa(nome = "Meu Pau") //Gosto de definir exatamente o nome do parametro para evitar erros
    println(coisa.nome)
    println(CARA)
    println("${soma(a=2, b=5)}  ${subtracao(b=1, a=16)}")
}