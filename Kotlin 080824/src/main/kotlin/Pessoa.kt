class Pessoa(var nome: String, var idade: Int) {


    //construtor para receber apenas o nome e setando a idade como zero
    constructor(nome:String) : this(nome, 0)

    //construtor para receber apenas a idade e setando o nome como desconhecido
    constructor(idade: Int) : this("desconhecido", idade)

    //não receber nenhum parametro
    constructor() : this ("", 0)

    fun apresentar(){
        println("meu nome é $nome e tenho $idade anos")
    }

}