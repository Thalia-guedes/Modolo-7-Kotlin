package Exercicio9

fun main (){
    println("--- CONVERSOR DE TEMPERATURA ---")

    println(" Digite uma temperatura em graus Celsius")
    val celsius = readln().toInt()

    val temperatura = celsius * 9/5 + 32

    println("A temperatura é: $temperatura Fahrenheit.")
}