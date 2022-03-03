fun combustivel():Unit {

    println("Qual Combustivel você vai querer?\nG - Gasolina\nA - Álcool")
    val tipoDoCombustivel = readLine()!!.toString()

    println("Quantos Litros você vai querer?")
    val litros = readLine()!!.toInt()

    val preco = (litros * 6)

    if (tipoDoCombustivel.equals("a", true) && litros <= 20) {
        println("O valor total é:R$${preco - (preco * 3) / 100}")
    } else if (tipoDoCombustivel.equals("a", true) && litros >= 20) {
        println("O valor total é:R$${preco - (preco * 5) / 100}")
    } else if (tipoDoCombustivel.equals("g", true) && litros <= 20) {
        println("O valor total é:R$${(preco - (preco * 4) / 100)}")
    } else if (tipoDoCombustivel.equals("g", true) && litros >= 20) {
        println("O valor total é::R$${preco - (preco * 6) / 100}")
    } else {
        println("Algo esta errado!!!")
    }
}
