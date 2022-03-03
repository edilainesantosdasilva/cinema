fun main(args: Array<String>){
    //taxas()
    pagamentos()

}
fun taxas(): Unit {
    println("Digite o numero de Crianças Nascidas:")
    val NumeroDeCriancasNascidas = readLine()!!.toInt()// taxas()

    println("Digite o numero de Habitantes:")
    val NumeroDeHabitantes = readLine()!!.toInt()

    println("Digite o numero de Óbitos:")
    val NumeroDeObitos = readLine()!!.toInt()
    println("Escolha qual taxa você quer descobrir:\n1 - Taxa De Natalidade\n2 - Taxa de óbitos")

    when (readLine()!!.toInt()) {
        1 -> println("A Taxa de Natalidade é: ${(NumeroDeCriancasNascidas * 1000) / NumeroDeHabitantes}")
        2 -> println("A Taxa de óbitos é: ${(NumeroDeObitos * 1000) / NumeroDeHabitantes}")
        else -> println("Operação Invalida!!!")
    }
}    fun pagamentos(): Unit{
    println("Digite o total da conta:")
        val totalDaCompra = readLine()!!.toFloat()
        println("Escolha o tipo de pagamento\n1 -À vista\n2 - À prazo(30 Dias)\n3 - À prazo parcelado")

        when(readLine()!!.toInt()){
        1-> println("O valor total À vista é: ${totalDaCompra - ((totalDaCompra * 10) / 100)}")
        2-> println("O valor total À prazo(30 dias) é: ${totalDaCompra + ((totalDaCompra * 3)/ 100)}")
        3-> println("O valor total À prazo parcelado é: ${totalDaCompra + ((totalDaCompra * 1.5)/ 100)}")
        else -> println("Forma de pagamento Invalido!!!")
    }
}



