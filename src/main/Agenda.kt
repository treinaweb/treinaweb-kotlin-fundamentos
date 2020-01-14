package main

fun main() {
    println("Olá, mundo!!")
    println("Curso de Kotlin da TreinaWeb");

    val nomeContato = "João"
    val emailContato = "joao@mail.com"
    val idadeContato : Int = 30

    var nomeDaVariavel : Int = 10 // Tipo Declarado
//    var nomeDaVariavel2 = 20 // Tipo Inferido
//    val nomeDaVariavel3 : String
//    val nomeDaVariavel4 = "TreinaWeb"
    var nomeDaVariavel5 : Double = 5.5
//    var nomeDaVariavel6 = 5.5
//    var nomeDaVariavel7 : Float = 5.5f
//    var nomeDaVariavel8 = 5.5f
//    nomeDaVariavel8 = 10.0f
//
//    nomeDaVariavel3 = "Teste"

    println(nomeDaVariavel5.toFloat() is Float)

    println(nomeDaVariavel.toString() is String)

    println(nomeDaVariavel)


    println(nomeContato)
    println(emailContato)
    println(idadeContato)


}