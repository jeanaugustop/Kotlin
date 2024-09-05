fun main(){
    //arrays()

    var carro1 = Carro()

    carro1.marca = "vousquivagem"
    carro1.modelo = "cetram10"

    carro1.acelerar()

    var contato1 = Contato("brito", "telefone")

    contato1.ligar()

    //instancias diferentes de pessoa

    var p1 = Pessoa("ENEAS", 78)
    var p2 = Pessoa("britoll")//construtor de apenas nome
    var p3 = Pessoa(10)
    var p4 = Pessoa()


    var jogo1 = Jogo("TL2", 1 , "comedia", 10f, "slaporra" )


    var jogo2 = Jogo("",1 , "comedia", 10f, "slaporra" )

    var jogo3 = Jogo()

    print(jogo3)
}



fun arrays() {


    var numeros = arrayOf(1,2,3,4,5)

    var nomes = arrayOf("joao","maria","jose")

    var idades = Array(5) {0}


    for (i in idades.indices){
        idades[i] = i + 0
        println(idades[i])
    }

    var valores = mutableListOf<Int>()//array dinamico


    valores.add(10)
    valores.add(12)
    valores.add(13)
    valores.add(14)
    valores.add(15)
    valores.add(16)
    valores.add(17)
    valores.add(18)


    println(valores.joinToString())
}