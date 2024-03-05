package com.example.cadastro

class Formulario(
    var nomeCompleto: String,
    var telefone: String,
    var email: String,
    var sexo: String,
    var cidade: String,
    var uf: String
) {
    override fun toString(): String {
        return """
            Nome Completo: $nomeCompleto
            Telefone: $telefone
            Email: $email
            Sexo: $sexo
            Cidade: $cidade
            UF: $uf
        """.trimIndent()
    }
}