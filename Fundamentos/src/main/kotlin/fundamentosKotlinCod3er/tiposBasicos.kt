package fundamentosKotlinCod3er

fun main() {
    // Inteiro e numeros maximos
    val n: Byte = 127 //Byte.MAX_VALUE
    val n1: Short = 32767 //Short.MAX_VALUE
    val n2: Int = 2_147_483_647 //Posso usar underline para separa os numeros  //Int.MAX_VALUE
    val n3: Long = 9_223_372_036_854_775_807  //Long.MAX_VALUE

    //Tipos Numericos Reais
    val R: Float  = 3.14f  //Sempre deve colocar f na frente do float
    val R1: Double = 3.14

    //Tipo Caractere
    val string: String = "Eai"
    val char: Char = '?' // Outros exemplos... '1', 'a', '  ',  '?', '!'   OBS: Nao se pode usar " ", tem que ser ' '

    //Tipo Booleano
    val boolean: Boolean = true


    val xx: Int = 2
    println(listOf(n, n1, n2, n3, R, R1, string, char, boolean))

    //  OBS: Tudo é objeto

    print(n1.dec())
}
