package one.digitalinnovationone.digitalonebank.testes

import one.digitalinnovationone.digitalonebank.ClienteTipo

fun main(){
    var clienteTipo : ClienteTipo = ClienteTipo.PF

    println(clienteTipo.retornaDescricao())

    //Iterar sobre o Enum -> 1ª forma
    println("1ª forma de iteração")
    ClienteTipo.values().forEach { clienteTipo -> println(clienteTipo.descricao)}

    //Iterar sobre o Enum -> 2ª forma
    println("2ª forma de iteração")
    ClienteTipo.values().forEach { println(it.descricao)}
}