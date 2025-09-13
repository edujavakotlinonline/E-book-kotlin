import kotlin.math.sqrt

fun main() {
    println("--- Encontre o Primeiro Número Primo ---")
    println("Este programa busca e exibe o primeiro número primo no intervalo de 100 a 200.")

    encontrarPrimeiroPrimo()

    println("\n--- Fim da Busca ---")
    println("Demonstração eficaz de laços aninhados e 'break' com rótulo! 😊")
}

/**
 * Encontra e imprime o primeiro número primo no intervalo de 100 a 200.
 * Utiliza laços aninhados, otimização da raiz quadrada e 'break' com rótulo.
 */
fun encontrarPrimeiroPrimo() {
    var primeiroPrimoEncontrado: Int? = null // Variável para armazenar o primeiro primo

    // Laço externo para iterar sobre os números no intervalo de 100 a 200
    // O rótulo 'buscaDePrimos' permite quebrar este laço de dentro do laço interno
    buscaDePrimos@ for (numero in 100..200) {
        var isPrimo = true // Assume que o número é primo inicialmente

        // Números menores ou iguais a 1 não são primos
        if (numero <= 1) {
            isPrimo = false
            // Continua para o próximo 'numero' no laço externo
            // Não precisamos de continue aqui, pois o resto do código depende de 'isPrimo'
        } else {
            // Otimização: para verificar se um número 'n' é primo, basta testar divisores até a raiz quadrada de 'n'.
            // Se 'n' tiver um fator maior que sua raiz quadrada, ele também deve ter um fator menor que sua raiz quadrada.
            val limiteDivisor = sqrt(numero.toDouble()).toInt()

            // Laço interno para testar divisores
            for (divisor in 2..limiteDivisor) {
                if (numero % divisor == 0) { // Se o número for divisível por 'divisor'
                    isPrimo = false // Não é primo
                    break // Quebra o laço interno (não é preciso testar mais divisores)
                }
            }
        }

        // Se 'isPrimo' ainda for true, significa que encontramos o primeiro primo
        if (isPrimo) {
            primeiroPrimoEncontrado = numero
            println("O primeiro número primo encontrado entre 100 e 200 é: $primeiroPrimoEncontrado")
            break@buscaDePrimos // *** AQUI ESTÁ O BREAK COM RÓTULO ***
            // Quebra o laço externo 'buscaDePrimos' e encerra a busca.
        }
    }

    if (primeiroPrimoEncontrado == null) {
        println("Nenhum número primo foi encontrado no intervalo especificado.")
    }
}