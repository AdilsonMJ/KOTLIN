package fundamentosKotlinCod3er.ClassesObjetos

class Pessoa1(var a: String)  // Visivel por padrao e pode alterar
class Pessoa2(val a: String) // Ler mais nao altera
class Pessoa3(nomeInicial: String){ // Nao tem acesso.
    val nome: String = nomeInicial  //Agora sim fica disponivel
}

fun main() {
    val p1 = Pessoa1(a = "Adilson")
    p1.a = "Luciani"
    print("${p1.a} esta em Pessoa 1, pode ser visivel e alterada")

    val p2 = Pessoa2(a = "Adilson")
   // p2.a = "Luciani"  >> Erro pois nao pode ser alterado depois de iniciada.
    println("${p2.a} nao pode ser alterada pois ja foi iniciada e tem val no construtor")

    val p3 = Pessoa3(nomeInicial = "Jessica") // Nao consigo visualizar e nem acessar ele depois de definido no construtor
    print("${p3.nome} >> Só tenho acesso pois criei uma variael e apontei para o construtor")
}

