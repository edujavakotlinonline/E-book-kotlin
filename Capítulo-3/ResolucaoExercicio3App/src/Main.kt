fun main() {
    println("--- Simulação de Tabuleiro de Xadrez ---")
    println("Este programa imprime um tabuleiro 8x8, alternando entre 'B' (branca) e 'P' (preta).")

    simularTabuleiroXadrez()

    println("\n--- Fim da Simulação ---")
}

/**
 * Simula a impressão de um tabuleiro de xadrez 8x8 no console.
 * Utiliza laços for aninhados e uma condicional para alternar as cores das casas.
 */
fun simularTabuleiroXadrez() {
    val tamanhoTabuleiro = 8 // Define o tamanho do tabuleiro (8x8)

    // Laço externo para as linhas (i)
    for (linha in 0 until tamanhoTabuleiro) { // Itera de 0 a 7 para as linhas
        // Laço interno para as colunas (j)
        for (coluna in 0 until tamanhoTabuleiro) { // Itera de 0 a 7 para as colunas

            // A cor da casa é determinada pela soma dos índices da linha e da coluna.
            // Se (linha + coluna) for par, é uma cor. Se for ímpar, é outra.
            if ((linha + coluna) % 2 == 0) {
                print("B") // Imprime 'B' para casa branca
            } else {
                print("P") // Imprime 'P' para casa preta
            }
        }
        println() // Após cada linha ser impressa, pula para a próxima linha
    }
}