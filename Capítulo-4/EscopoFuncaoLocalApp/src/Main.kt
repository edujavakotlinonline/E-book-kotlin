fun processarDados(listaDeNumeros: List<Int>) {
    fun filtrarPositivos(numeros: List<Int>): List<Int> { // Função local
        val limite = 0 // Variável do escopo externo (processarDados)
        return numeros.filter { it > limite }
    }

    val positivos = filtrarPositivos(listaDeNumeros)
    println("Números originais: $listaDeNumeros")
    println("Números positivos: $positivos")

    // A função filtrarPositivos não pode ser chamada aqui, fora de processarDados
    // filtrarPositivos(...) // Erro de compilação
}

fun main() {
    processarDados(listOf(-1, 0, 5, -3, 10))
    // Saída:
    // Números originais: [-1, 0, 5, -3, 10]
    // Números positivos: [5, 10]
}