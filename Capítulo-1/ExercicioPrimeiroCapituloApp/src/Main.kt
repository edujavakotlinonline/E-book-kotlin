//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("--- Verificador de Números Pares ou Ímpares ---")

    // Exemplo 1: Número par positivo
    val number1 = 10
    // O operador '%' retorna o resto da divisão. 10 % 2 = 0
    if (number1 % 2 == 0) {
        println("O número ${number1} é PAR.")
    } else {
        println("O número ${number1} é ÍMPAR.")
    }
    // Saída esperada: O número 10 é PAR.

    println("\n-------------------------------------")

    // Exemplo 2: Número ímpar positivo
    val number2 = 7
    // 7 % 2 = 1
    if (number2 % 2 == 0) {
        println("O número ${number2} é PAR.")
    } else {
        println("O número ${number2} é ÍMPAR.")
    }
    // Saída esperada: O número 7 é ÍMPAR.

    println("\n-------------------------------------")

    // Exemplo 3: Zero (considerado par em programação e matemática, pois 0 % 2 = 0)
    val number3 = 0
    if (number3 % 2 == 0) {
        println("O número ${number3} é PAR.")
    } else {
        println("O número ${number3} é ÍMPAR.")
    }
    // Saída esperada: O número 0 é PAR.

    println("\n-------------------------------------")

    // Exemplo 4: Número negativo ímpar
    // Em Kotlin (e Java), o operador módulo (%) mantém o sinal do dividendo.
    // Assim, -5 % 2 = -1. Como -1 não é 0, o número é ímpar.
    val number4 = -5
    if (number4 % 2 == 0) {
        println("O número ${number4} é PAR.")
    } else {
        println("O número ${number4} é ÍMPAR.")
    }
    // Saída esperada: O número -5 é ÍMPAR.

    println("\n-------------------------------------")

    // Exemplo 5: Número negativo par
    // -4 % 2 = 0.
    val number5 = -4
    if (number5 % 2 == 0) {
        println("O número ${number5} é PAR.")
    } else {
        println("O número ${number5} é ÍMPAR.")
    }
    // Saída esperada: O número -4 é PAR.
}