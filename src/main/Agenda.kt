package main

import java.util.*

fun main() {
//    var nomeDaVariavel : Int = 10 // Tipo Declarado
//    var nomeDaVariavel2 = 20 // Tipo Inferido
//    val nomeDaVariavel3 : String
//    val nomeDaVariavel4 = "TreinaWeb"
//    var nomeDaVariavel5 : Double = 5.5
//    var nomeDaVariavel6 = 5.5
//    var nomeDaVariavel7 : Float = 5.5f
//    var nomeDaVariavel8 = 5.5f
//    nomeDaVariavel8 = 10.0f
//
//    nomeDaVariavel3 = "Teste"

//    println(nomeDaVariavel5.toFloat() is Float)
//
//    println(nomeDaVariavel.toString() is String)
//
//    println(nomeDaVariavel)

    println("Olá, mundo!!")
    println("Curso de Kotlin da TreinaWeb");
    val nomeContato : String
    val emailContato : String
    val idadeContato : Int
    val input = Scanner(System.`in`)
    println("Digite o nome do contato")
    nomeContato = input.nextLine()
    println("Digite o email do contato")
    emailContato = input.nextLine()
    println("Digite a idade do contato")
    idadeContato = input.nextInt()


    println(nomeContato)
    println(emailContato)
    println(idadeContato)


}