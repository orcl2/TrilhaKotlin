package one.digitalinnovationone.digitalonebank.testes

import one.digitalinnovationone.digitalonebank.Analista
import one.digitalinnovationone.digitalonebank.Funcionario

fun main(){
    var william =  Analista("William Daniel", "032.165.498-70", 1400.00)

    william.calculoAuxilio()

    imprimeRelatorio(william)

}

fun imprimeRelatorio(funcionario: Funcionario) = println(funcionario.toString())