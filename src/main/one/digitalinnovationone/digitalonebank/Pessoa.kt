package one.digitalinnovationone.digitalonebank

class Pessoa{
    var nome : String = "William Daniel"
    var cpf = "132.315.426-50"
    private set

    constructor()

    inner class Endereco{
        var rua : String = "15 de Novembro"
    }

    fun pessoaInfo() = "$nome e $cpf"
}

fun main(){
    val pessoa = Pessoa()

    println(pessoa.pessoaInfo())

}
