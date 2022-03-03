fun main() {
    val cineMax = Cinema("CineMax", 10, 20)

    println("Olá, seja bem-vindo a CineMax")

    if (
        cineMax.adicionarNovoFilme(
            Filme(
                nomeFilme = "the return",
                genero= "comedia,drama",
                anoDeEstreia = 1990
            )
        )
    )
        if (
            cineMax.adicionarNovoFilme(
                Filme(
                    nomeFilme = "O Regresso",
                    genero= "drama",
                    anoDeEstreia= 1950

                )
            )
        )
            println("Filmes em Cartaz: ")

    val filme = cineMax.listarTodosOsFilmes()
    val numeroDeFilmes = filme.size - 1
    for (indice in 0..numeroDeFilmes) {
        println("\nNome: ${filme[indice].nomeFilme}")
    }

    println("\nQual filme você quer ver?\n1 - The Batman \n2 - O Regresso")
    val escolha = readLine()!!.toInt()

    if (escolha == 1) {
        cineMax.cadrastrarAssento(
            Assento(
                numeroAssento = 1,
                ocupado = "Não"
            )
        )
    } else if (escolha == 2) {
        cineMax.cadrastrarAssento(
            Assento(
                numeroAssento = 1,
                ocupado = "Não"
            )
        )
    } else {
        println("Algo deu errado na sua escolha...")
    }

    if (escolha == 1) {
        cineMax.cadrastrarAssento(
            Assento(
                numeroAssento = 2,
                ocupado = "Sim"
            )
        )
    } else if (escolha == 2) {
        cineMax.cadrastrarAssento(
            Assento(
                numeroAssento = 3,
                ocupado = "Nâo"
            )
        )
    }
    if (escolha == 1) {
        cineMax.cadrastrarAssento(
            Assento(
                numeroAssento = 3,
                ocupado = "Sim"
            )
        )
    } else if (escolha == 2) {
        cineMax.cadrastrarAssento(
            Assento(
                numeroAssento = 3,
                ocupado = "Não"
            )
        )
    }


    println("Assentos disponíveis:")
    val assento = cineMax.listarAssentos()
    val numeroDeAssentos = assento.size - 1
    for (indice in 0..numeroDeAssentos) {
        println("\nAssento: ${assento[indice].numeroAssento}\nEstá ocupado: ${assento[indice].ocupado}")
    }

    println("Digite seu nome?")
    val nomeCompleto = readLine()!!.toString()

    println("\nQual assento vai querer ${nomeCompleto}?\nDigite 1 para o primeiro assento\nDigite 2 para o segundo assento\nDigite 3 para o terceiro assento ")
    val ocupado = readLine()!!.toInt()
    if (escolha == 1 && ocupado == 3) {
        println("este assento já está ocupado")
    } else if (escolha == 2 && ocupado == 2 ||
        escolha == 2 && ocupado == 3
    ) {
        println("este assento já está ocupado")
    }

    val valoringresso = 20
    val meia = 4
    val taxa = 5.25

    println("\nVocê se encaixa em alguma dessas alternativas?\n1 - Estudante\n2 - Professor\n3 - Idoso\n4 - nenhuma")
    val valorTotal = when (readLine()!!.toInt()) {
        1 -> println("O valor fica: ${(valoringresso / meia) + taxa}")
        2 -> println("O valor fica: ${(valoringresso / meia) + taxa}")
        3 -> println("O valor fica: ${(valoringresso / meia) + taxa}")
        else -> println("o valor fica: 40,59")
    }

    println(" ${nomeCompleto}, deseja terminar a compra de um ingresso no valor de: ${valorTotal}\n1 - Sim\n2 - não")
    val fim = readLine()!!.toInt()

    if (fim == 1) {
        println("Tenha um bom filme")
    } else if (fim == 2) {
        println("Volte Sempre...")
    }
}