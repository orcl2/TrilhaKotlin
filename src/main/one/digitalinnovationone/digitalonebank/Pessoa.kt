package one.digitalinnovationone.digitalonebank

class Pessoa{
    var nome : String = "William Daniel"
    var cpf = "132.315.426-50"
    private set

    inner class Endereco{
        var rua : String = "15 de Novembro"
    }
}

fun main(){
    val pessoa = Pessoa()

    println(pessoa.nome)
    println(pessoa.cpf)
    println(pessoa.Endereco().rua)

}
