// 1. Crie uma lambda que receba três números inteiros e retorne o maior entre eles.
val encontrarMaior: (Int, Int, Int) -> Int = { num1, num2, num3 ->
    // Kotlin tem a função 'maxOf' que pode receber múltiplos argumentos para encontrar o maior.
    maxOf(num1, num2, num3)
    // Alternativamente, uma implementação manual seria:
    // if (num1 >= num2 && num1 >= num3) num1
    // else if (num2 >= num1 && num2 >= num3) num2
    // else num3
}

// 2. Crie uma lambda que receba uma lista de strings e retorne uma nova lista
//    contendo apenas as strings que têm mais de 5 caracteres.
val filtrarStringsLongas: (List<String>) -> List<String> = { listaDeStrings ->
    listaDeStrings.filter { it.length > 5 }
    // A função 'filter' é uma função de ordem superior da Collection API.
    // O 'it' refere-se a cada string na lista sendo processada pela lambda interna.
}

// 3. Crie uma função de ordem superior aplicarOperacao(a: Int, b: Int, operacao: (Int, Int) -> Int)
//    que receba dois inteiros e uma lambda de operação.
fun aplicarOperacao(a: Int, b: Int, operacao: (Int, Int) -> Int) {
    val resultado = operacao(a, b) // Executa a lambda passada como parâmetro
    println("Resultado da operação: $resultado")
}

fun main() {
    println("--- Exercício 2: Implementar Lambdas e Funções de Ordem Superior ---")

    // Teste da lambda 'encontrarMaior'
    println("\n>>> Teste: encontrarMaior (10, 5, 20)") // Note que as aspas " fazem parte da string literal
    println(encontrarMaior(10, 5, 20)) // Saída esperada: 20
    println("--------------------------------------")

    // Teste da lambda 'filtrarStringsLongas'
    println("\n>>> Teste: filtrarStringsLongas")
    val palavras = listOf("kotlin", "java", "python", "js", "scala", "csharp")
    println("Lista original: $palavras")
    println("Strings longas: ${filtrarStringsLongas(palavras)}") // Saída esperada: [kotlin, python, scala, csharp]
    println("--------------------------------------")

    // Teste da função de ordem superior 'aplicarOperacao'
    println("\n>>> Teste: aplicarOperacao com soma, subtração e multiplicação")
    val numA = 20
    val numB = 5

    // Lambda para Soma
    val somar: (Int, Int) -> Int = { x, y -> x + y }
    aplicarOperacao(numA, numB, somar) // Saída esperada: Resultado da operação: 25

    // Lambda para Subtração (passada diretamente como trailing lambda)
    aplicarOperacao(numA, numB) { x, y -> x - y } // Saída esperada: Resultado da operação: 15

    // Lambda para Multiplicação
    val multiplicar: (Int, Int) -> Int = { x, y -> x * y }
    aplicarOperacao(numA, numB, multiplicar) // Saída esperada: Resultado da operação: 100
    println("--------------------------------------")

    println("\n--- Fim do Exercício 2 ---")
}