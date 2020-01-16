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
    // var nomeContatoObrigatorio : String = nomeContato ?: "Valor Padrão" // Elvis Operator
    // println(nomeContatoObrigatorio.length)
    val emailContato : String
    var idadeContato : Int? = null
    // val input = Scanner(System.`in`)
    println("Digite o nome do contato")
    nomeContato = readLine().toString()
    //nomeContato = input.nextLine()
    println("Digite o email do contato")
    emailContato = readLine().toString()
    //emailContato = input.nextLine()
    println("Digite a idade do contato")
    idadeContato = readLine()?.toInt()
    //idadeContato = input.nextInt()


    println("O nome do contato é: $nomeContato que possui ${nomeContato?.length} caracteres")
    println("O email do contato é: $emailContato")
    println("A idade do contato é: $idadeContato")

//    if (idadeContato != null) {
//        if (idadeContato <= 17) {
//            println("O contato é menor de idade")
//        } else if (idadeContato in 18 .. 60) {
//            println("O contato é adulto")
//        } else {
//            println("O contato é idoso")
//        }
//    }

    if (idadeContato != null) {
        when (idadeContato) {
            in 1..17 -> println("O contato é menor de idade")
            in 18..60 -> {
                println("o contato já pode ser preso")
                println("O contato é adulto")
            }
            else -> println("O contato é idoso")
        }
    }

    println(nomeContato.equals("Maria"))
    println(nomeContato?.reversed())
    println(nomeContato?.slice(1..3))
    println(nomeContato?.get(3))

}