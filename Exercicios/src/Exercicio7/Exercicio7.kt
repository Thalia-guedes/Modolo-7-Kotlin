package Exercicio7

fun main (){
    println("Digite o nome do Vendedor")
    val nome = readln()

    println("Digite o salario: ")
    val salario = readln().toDouble()

    println("Digite a quantidade de vendas: ")
    val vendas = readln().toDouble()

    val comissao =15

    val soma = comissao * vendas
    val salarioFinal = salario + soma

    println("Vendedor: $nome\n Salario $salario " +
            "\nVendas $vendas, \n Comissao: " +
            "$comissao% , " +
            "totalizando em $salarioFinal mês")
}