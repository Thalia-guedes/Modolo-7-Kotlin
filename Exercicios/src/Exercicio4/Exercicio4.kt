package Exercicio4

fun main (){

    retangulo()
}
fun retangulo (){
    println("Digite a base do Retangulo: ")

    val base = readln().toDouble()

    println("Digite a altura do Retangulo: ")
    val altura = readln().toDouble()


    val resultado = base * altura

    println("A area do Retangulo é de : $resultado")
}