// Funções de Extensão para a classe String
fun String.contarPalavras(): Int {
    // Remove espaços em branco do início e fim e divide a string por um ou mais espaços.
    // O filter { it.isNotBlank() } garante que não contamos strings vazias resultantes de múltiplos espaços.
    val palavras = this.trim().split(Regex("\s+")).filter { it.isNotBlank() }
    return palavras.size
}

fun String.estaVaziaOuSomenteEspacos(): Boolean {
    // Kotlin já possui uma função built-in para isso: isBlank()
    // Ela verifica se a string está vazia OU contém apenas caracteres de espaço em branco.
    return this.isBlank()
    // Alternativamente, uma implementação manual seria:
    // return this.isEmpty() || this.all { it.isWhitespace() }
}

fun String.inverter(): String {
    // Kotlin possui uma função built-in para inverter strings: reversed()
    return this.reversed()
}

fun main() {
    println("--- Testando Funções de Extensão para String ---")

    val frase = " Kotlin é divertido! "
    println("Frase: $frase")
    println("Número de palavras: ${frase.contarPalavras()}") // Saída esperada: 3

    println("Está vazia ou só tem espaços? ${frase.estaVaziaOuSomenteEspacos()}") // Saída esperada: false
    println("---------------------------------------------")

    val espacos = "   " // Assumindo que você quer uma string com espaços

    println("Frase: $espacos")
    println("Está vazia ou só tem espaços? ${espacos.estaVaziaOuSomenteEspacos()}") // Saída esperada: true
    println("---------------------------------------------")

    val vazia = ""
    println("Frase: $vazia")
    println("Está vazia ou só tem espaços? ${vazia.estaVaziaOuSomenteEspacos()}") // Saída esperada: true
    println("---------------------------------------------")

    val palavra = "programacao"
    println("Palavra: $palavra")
    println("Invertida: ${palavra.inverter()}") // Saída esperada: oacamargorp
    println("--------------------------------------")
}