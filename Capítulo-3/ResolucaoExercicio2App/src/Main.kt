fun main() {
    println("--- Calculadora Simples com 'when' ---")
    println("Demonstra o uso da 'when' expression para realizar operações aritméticas básicas com tratamento de erros.")

    // --- Exemplos de uso ---
    println("\n--- Testes de Operações Válidas ---")

    var resultado = calculadoraSimples(10.0, 5.0, "soma")
    println("10.0 + 5.0 = ${resultado.getOrElse { "Erro: ${it.message}" }}") // Saída esperada: 15.0

    resultado = calculadoraSimples(10.0, 5.0, "subtracao")
    println("10.0 - 5.0 = ${resultado.getOrElse { "Erro: ${it.message}" }}") // Saída esperada: 5.0

    resultado = calculadoraSimples(4.0, 2.5, "multiplicacao")
    println("4.0 * 2.5 = ${resultado.getOrElse { "Erro: ${it.message}" }}") // Saída esperada: 10.0

    resultado = calculadoraSimples(10.0, 2.0, "divisao")
    println("10.0 / 2.0 = ${resultado.getOrElse { "Erro: ${it.message}" }}") // Saída esperada: 5.0

    println("\n--- Testes de Tratamento de Erros ---")

    // Divisão por zero
    resultado = calculadoraSimples(10.0, 0.0, "divisao")
    println("10.0 / 0.0 = ${resultado.getOrElse { "Erro: ${it.message}" }}") // Saída esperada: Erro: Divisão por zero não é permitida.

    // Operação inválida
    resultado = calculadoraSimples(10.0, 5.0, "potencia")
    println("10.0 ^ 5.0 = ${resultado.getOrElse { "Erro: ${it.message}" }}") // Saída esperada: Erro: Operação inválida: potencia

    // Operação com caixa de texto diferente (insensitive)
    resultado = calculadoraSimples(7.0, 3.0, "DivIsAo")
    println("7.0 / 3.0 = ${resultado.getOrElse { "Erro: ${it.message}" }}") // Saída esperada: 2.3333333333333335 (aproximadamente)

    println("\n--- Fim da Calculadora Simples ---")
}

/**
 * Realiza uma operação aritmética simples entre dois números.
 *
 * @param num1 O primeiro número (operando).
 * @param num2 O segundo número (operando).
 * @param operacao A string que define a operação ("soma", "subtracao", "multiplicacao", "divisao").
 * @return Um objeto [Result] contendo o resultado da operação em caso de sucesso,
 *         ou um [Throwable] (IllegalArgumentException) em caso de falha (divisão por zero ou operação inválida).
 */
fun calculadoraSimples(num1: Double, num2: Double, operacao: String): Result<Double> {
    // Usamos 'when' como uma expressão, ou seja, ela retorna um valor.
    // 'toLowerCase()' é usado para tornar a comparação da operação insensível a maiúsculas/minúsculas.
    return when (operacao.toLowerCase()) {
        "soma" -> Result.success(num1 + num2)
        "subtracao" -> Result.success(num1 - num2)
        "multiplicacao" -> Result.success(num1 * num2)
        "divisao" -> {
            // Tratamento específico para divisão por zero
            if (num2 == 0.0) {
                Result.failure(IllegalArgumentException("Divisão por zero não é permitida."))
            } else {
                Result.success(num1 / num2)
            }
        }
        // Cláusula 'else' para tratar operações inválidas, pois 'when' como expressão exige que todas as possibilidades sejam cobertas.
        else -> Result.failure(IllegalArgumentException("Operação inválida: $operacao"))
    }
}