class Jogo (var titulo: String,
            var ano : Int,
            var genero: String,
            var metaScore: Float,
            var plataforma: String){

    constructor() : this(
        "desconhecido",
        10,
        "desconhecido",
        10f,
        "desconhecido",
    )

    override fun toString(): String {
        return "Jogo(titulo='$titulo', ano=$ano, genero='$genero', metaScore=$metaScore, plataforma='$plataforma')"
    }


}