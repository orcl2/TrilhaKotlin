package one.digitalinnovationone.digitalonebank.testes

import one.digitalinnovationone.digitalonebank.Banco

fun main(){
    val digiOneBank = Banco("DigiOne", 12)
    println(digiOneBank.info())

    val  digiOneBank2 = digiOneBank.copy("DigiOne2", 13)
    println(digiOneBank2.info())

}