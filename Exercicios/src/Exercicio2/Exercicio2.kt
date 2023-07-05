package Exercicio2

fun main(){
    println("Qual o seu nome?")
    var nome1 = readln()

    val mostrar = mostrarNome(nome1)
}

fun mostrarNome (nome: String): String{
    return println("Meu nome é $nome").toString()
}