package Exercicio5

fun main() {
    println("Digite um numero: ")
    val numero1 = readln().toInt()

    println("Digite outro numero: ")
    val numero2 = readln().toInt()

    println("Escolha uma opcao \n 1- Somar \n 2- Subtrair \n 3- Multiplicar \n 4- Dividir")
    val opcao = readln().toInt()
    val result = receptor(numero1, numero2, opcao)
    println("o resultado da operaçao é $result")
}

fun receptor(numero1: Int, numero2: Int, opcao: Int): Int {

    return when (opcao) {
        1 -> numero1 + numero2
        2 -> numero1 - numero2
        3 -> numero1 * numero2
        4 -> numero1 / numero2
        else -> throw IllegalArgumentException("Opção inválida")
    }

}