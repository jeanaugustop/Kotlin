package com.example.aula09_09

class Validacao {

    companion object{

        private const val USER = "jean"
        private const val PASSWORD = "lalala"

        fun validarLogin( usuario : String, senha : String): Boolean{

            if(usuario == USER && senha == PASSWORD){
                return  true
            }
            return false
        }

    }

}