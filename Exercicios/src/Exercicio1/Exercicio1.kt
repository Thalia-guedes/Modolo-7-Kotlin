package Exercicio1

fun main (){
    println("Digite um numero")
    val numero = readln().toInt()

    var resultado = soma(numero)

    println("  A soma do intervalo de $numero é $resultado")
}
fun soma (numero: Int): Int{

    var somarNumeros = 0
    for (i in 1..numero) {
        somarNumeros += i
    }
    return somarNumeros

}