package Exercicio3

fun main (){
    println("Digite o seu peso: ")
    var peso = readln().toDouble()
    println("Digite sua altura: ")
    var altura = readln().toDouble()


    var resultado = imc (peso , altura)

}
fun imc (altura: Double, peso : Double) :Double{
    val divisao = peso / altura

    if (divisao < 18.5){
        println("Magreza")
    }else if (divisao >= 18.5 && divisao < 24.9){
        println("Normal")
    }else if (divisao >= 25.0 && divisao < 29.9){
        println("Sobrepeso")
    }else if (divisao >= 30.0 && divisao < 39.9){
        println("Obesidade grau 3")
    } else if (divisao > 40.0){
        println("Obesidade maxima")
    }
    return  divisao
//    when{
//        divisao >= 18.5 -> println("Magreza")
//        divisao >= 18.5 && divisao < 24.9 -> println("Normal")
//        divisao >= 25.0 && divisao < 29.9 -> println("Sobrepeso")
//        divisao >= 30.0 && divisao < 39.9 -> println("Obesidade grau 3")
//        divisao > 40.0 -> println("Obesidade maxima")
//
//    }

}
