import java.util.Scanner

fun main() {
    var tentativa = 0
    val senhaCorreta = "kotlin"
    var senhaDigitada: String

    val scanner = Scanner(System.`in`) // Para ler a entrada do usuário

    do {
        print("Digite a senha: ")
        senhaDigitada = scanner.nextLine()
        tentativa++
        if (senhaDigitada != senhaCorreta) {
            println("Senha incorreta. Tentativa $tentativa.")
        }
    } while (senhaDigitada != senhaCorreta && tentativa < 3)

    if (senhaDigitada == senhaCorreta) {
        println("Acesso concedido!")
    } else {
        println("Tentativas esgotadas. Acesso negado.")
    }
    scanner.close() // Fechar o scanner
}
/* Exemplo de execução (interativo):
Digite a senha: abc
Senha incorreta. Tentativa 1.
Digite a senha: 123
Senha incorreta. Tentativa 2.
Digite a senha: kotlin
Acesso concedido!
*/