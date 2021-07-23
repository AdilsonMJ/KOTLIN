package DigitalInnovationOne.teste

import DigitalInnovationOne.Banco

fun main() {
    val inter: Banco = Banco(nome = "Inter Bank", numero = 524)
    val roxinho = inter.copy(nome = "RoxinhoSafado", numero = 710)

    println(inter.info())
    println(roxinho.info())
}