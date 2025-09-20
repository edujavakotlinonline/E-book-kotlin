// Função de extensão para String
fun String.primeiraLetraMaiuscula(): String {
    if (this.isEmpty()) return this
    return this.substring(0, 1).toUpperCase() + this.substring(1).toLowerCase()
}

// Outra função de extensão para Int
fun Int.isPar(): Boolean = this % 2 == 0

fun main() {
    val nome = "edu"
    println(nome.primeiraLetraMaiuscula()) // Saída: Edu

    val frase = "ola mundo kotlin"
    println(frase.primeiraLetraMaiuscula()) // Saída: Ola mundo kotlin

    val numero = 7
    println("$numero é par? ${numero.isPar()}") // Saída: 7 é par? false

    val outroNumero = 10
    println("$outroNumero é par? ${outroNumero.isPar()}") // Saída: 10 é par? true
}