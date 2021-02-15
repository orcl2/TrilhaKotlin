package one.digitalinnovationone.digitalonebank

import java.math.BigDecimal

abstract class Funcionario(
        nome : String,
        cpf : String,
        var salario : Double)
    : Pessoa(nome, cpf)
{
    abstract fun calculoAuxilio()
    override fun toString(): String {
        return "Nome: $nome" +
                "CPF: $cpf " +
                "Salário: $salario"
    }
}