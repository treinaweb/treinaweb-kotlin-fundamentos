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
    var nomeContato : String? = null // Safe Call Operator
    val emailContato : String
    val idadeContato : Int
    val input = Scanner(System.`in`)
    //println("Digite o nome do contato")
    //nomeContato = readLine().toString()
    //nomeContato = input.nextLine()
    println("Digite o email do contato")
    emailContato = readLine().toString()
    //emailContato = input.nextLine()
    println("Digite a idade do contato")
    //idadeContato = readLine().toInt()
    idadeContato = input.nextInt()


    println("O nome do contato é: $nomeContato que possui ${nomeContato?.length} caracteres")
    println("O email do contato é: $emailContato")
    println("A idade do contato é: $idadeContato")

    println(nomeContato.equals("Maria"))
    println(nomeContato?.reversed())
    println(nomeContato?.slice(1..3))
    println(nomeContato?.get(3))

}