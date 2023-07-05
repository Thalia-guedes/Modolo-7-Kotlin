package Exercicio11

fun main (){
    println("Digite o preço de custo do produto")
    val preco = readln().toDouble()

    println(" informe o percentual para revenda: ")
    val revenda = readln().toDouble()

    val resultado = preco * (1 + revenda / 100)


    println(resultado)
}