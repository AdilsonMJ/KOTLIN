package DigitalInnovationOne.teste

import DigitalInnovationOne.ClienteTipo

fun main() {
    ClienteTipo.values().forEach { elemento ->
        print("$elemento e $elemento.toString()")
    }

    ClienteTipo.values().forEach {
        print("${it.name} e $it")
    }
}