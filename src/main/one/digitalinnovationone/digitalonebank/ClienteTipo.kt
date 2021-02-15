package one.digitalinnovationone.digitalonebank

enum class ClienteTipo(val descricao: String) {
    PF("Pessoa Física"),
    PJ("Pessoa Jurídica");

    fun retornaDescricao() = "$descricao"
}