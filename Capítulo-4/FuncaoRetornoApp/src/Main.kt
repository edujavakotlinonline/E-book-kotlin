// Define uma função que explicitamente retorna Unit.
// O corpo da função não precisa de um 'return' se o tipo for Unit.
fun logarAcao(acao: String): Unit {
    println("LOG: Executando a ação -> '$acao'")
    // Não há 'return' explícito aqui, o compilador insere Unit
}

// Define uma função que verifica se um número é par.
// Ela aceita um Int e retorna true se o número for par, e false caso contrário.
fun ehPar(numero: Int): Boolean {
    return numero % 2 == 0 // O operador '%' retorna o resto da divisão. Se o resto for 0, é par.
}

fun imprimirMensagem(mensagem: String) {
    println(mensagem)
}

fun main() {
    println("--- Demonstração de Retorno Unit ---")

    // Chamada de função que retorna Unit (implícito)
    imprimirMensagem("Iniciando o programa...")

    // Chamada de função que retorna Unit (explícito)
    val resultadoLog = logarAcao("Carregando configurações")
    println("O valor retornado por 'logarAcao' é: $resultadoLog") // Saída: O valor retornado por 'logarAcao' é: kotlin.Unit

    println("--- Demonstração de Retorno Boolean ---")

    // --- Usando a função ehPar ---
    val numero1 = 4
    val numero2 = 7
    println("O número $numero1 é par? ${ehPar(numero1)}") // Saída esperada: O número 4 é par? true
    println("O número $numero2 é par? ${ehPar(numero2)}") // Saída esperada: O número 7 é par? false

    // Usando o resultado Boolean diretamente em uma estrutura de controle
    if (ehPar(10)) {
        println("10 é um número par, confirmado!")
    } else {
        println("10 não é um número par.")
    }

    imprimirMensagem("Programa finalizado.")
}