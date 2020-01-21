package main

import java.util.*

data class Contato(var nomeContato: String, var emailContato: String, var idadeContato: Int?)

fun main() {
    println("Olá, mundo!!")
    println("Curso de Kotlin da TreinaWeb");
    var opcao: Int? = 0
    var listaContato = mutableListOf<Contato>()
    nome_do_loop@ do {
        var nomeContato: String? = null // Safe Call Operator
        val emailContato: String
        var idadeContato: Int? = null
        println("Digite o nome do contato")
        nomeContato = readLine().toString()
        println("Digite o email do contato")
        emailContato = readLine().toString()
        println("Digite a idade do contato")
        idadeContato = readLine()?.toInt()

        var contato1 = Contato(nomeContato, emailContato, idadeContato)
        listaContato.add(contato1) // ((Maria, maria@mail.com, 50), (João, joao@mail.com, 30))

        println("O nome do contato é: ${contato1.nomeContato} que possui ${contato1.nomeContato?.length} caracteres")
        println("O email do contato é: ${contato1.emailContato}")
        println("A idade do contato é: ${contato1.idadeContato}")

        if (contato1.idadeContato != null) {
            when (contato1.idadeContato) {
                in 1..17 -> {
                    //continue@nome_do_loop
                    println("O contato é menor de idade")
                }
                in 18..60 -> {
                    println("o contato já pode ser preso")
                    println("O contato é adulto")
                }
                else -> println("O contato é idoso")
            }
        }

//        for (i in 1..5) {
//            if (i % 2 == 0) {
//                continue
//                println(i)
//            }
//            println(i)
//        }

//        println(contato1.nomeContato.equals("Maria"))
//        println(contato1.nomeContato?.reversed())
//        println(contato1.nomeContato?.slice(1..3))
//        println(contato1.nomeContato?.get(3))

        println("Deseja continuar? 0 - SIM / 1 - NÃO")
        opcao = readLine()?.toInt()
    } while(opcao == 0)

    for (i in listaContato) {
        println("Nome: ${i.nomeContato} / Idade: ${i.idadeContato} / Email: ${i.emailContato}")
    }

    println("Obrigado por utilizar nosso gerenciamento de contatos")

}