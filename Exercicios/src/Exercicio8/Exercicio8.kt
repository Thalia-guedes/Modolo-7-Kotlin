package Exercicio8

fun main (){
    println("Digite o nome do Aluno: ")
    val nome = readln()
    val notas : DoubleArray = doubleArrayOf( 7.5, 8.6, 9.7 )

    //average verifica a media dos numeros no array
    val media = notas.average()

    println("A media de notas do Aluno $nome é $media")
}