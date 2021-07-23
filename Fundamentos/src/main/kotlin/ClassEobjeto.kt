class Casa{
    //Propriedades ou Atributos
    var cor: String="";

    //metodos
    fun abrirJanela(qtd: Int){
        println("Abrir ${qtd} Janelas");
    }

    fun abrirPorta(){
        println(" Abrir  porta ");
    }

    fun abrirCasa(qtd: Int){
        abrirJanela(qtd);
        abrirPorta();
    }
}

fun main() {
    val casa:Casa = Casa();
    casa.cor = "Azul";

    println(casa.cor);
    println(casa.abrirJanela(3));
    println(casa.abrirCasa(5));
}