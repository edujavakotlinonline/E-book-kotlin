// Define uma função que aceita dois números inteiros e retorna a soma deles.
fun somar(a: Int, b: Int): Int {
    return a + b
}

// Define uma função que aceita um nome (String) e uma idade (Int) e imprime uma saudação.
// Note que esta função não retorna um valor explícito (retorna Unit implicitamente).
fun cumprimentarPessoa(nome: String, idade: Int) {
    println("Olá, $nome! Você tem $idade anos.")
}

fun main() {
    // --- Demonstração de Funções Simples ---
    println("--- Demonstração de Funções Simples ---")

    // --- Uso da função somar ---
    println("\n--- Função somar ---")
    val resultado = somar(5, 3) // Chama a função 'somar' e armazena o resultado
    println("A soma é: $resultado") // Saída: A soma é: 8

    // --- Uso da função cumprimentarPessoa ---
    println("\n--- Função cumprimentarPessoa ---")
    cumprimentarPessoa("Edu", 30) // Chama a função 'cumprimentarPessoa' com nome e idade
}