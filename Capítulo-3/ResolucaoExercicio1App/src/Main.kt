fun main() {
    println("--- Validador de Senha Avançado ---")
    println("Este programa solicita ao usuário uma senha até que ela atenda a critérios específicos.")
    println("Digite 'sair' a qualquer momento para encerrar o programa.")

    validarSenhaAvancada()

    println("\n--- Fim do Validador de Senha ---")
    println("Obrigado por usar o validador, Edu! 😊")
}

/**
 * Função para validar uma senha avançada, solicitando ao usuário que digite uma senha
 * até que ela atenda a certos critérios ou que o usuário digite "sair".
 *
 * Critérios de validação:
 * - Mínimo de 8 caracteres.
 * - Deve conter pelo menos uma letra maiúscula.
 * - Deve conter pelo menos uma letra minúscula.
 * - Deve conter pelo menos um número.
 */
fun validarSenhaAvancada() {
    var senhaValida = false
    var senha: String? // Variável para armazenar a senha digitada pelo usuário

    println("\n--- Critérios da Senha ---")
    println("- Mínimo de 8 caracteres")
    println("- Pelo menos uma letra maiúscula (A-Z)")
    println("- Pelo menos uma letra minúscula (a-z)")
    println("- Pelo menos um número (0-9)")

    // O laço do-while garante que a senha será solicitada e validada pelo menos uma vez.
    do {
        print("\nPor favor, digite sua senha (ou 'sair' para encerrar): ")
        senha = readLine() // Lê a entrada do usuário do console

        // 1. Verificar se o usuário quer sair
        if (senha.equals("sair", ignoreCase = true)) {
            println("Validação de senha encerrada pelo usuário.")
            break // Sai imediatamente da função `validarSenhaAvancada`
        }

        // Garante que a senha não é nula (caso o readLine() retorne null, o que é raro em execução normal do console)
        if (senha == null) {
            println("❌ Erro na leitura. Nenhuma entrada recebida. Tente novamente.")
            senhaValida = false // Mantém o loop ativo
            continue // Pula para a próxima iteração do do-while
        }

        // Assume que a senha é válida no início de cada iteração, e muda para false se alguma validação falhar.
        senhaValida = true
        val mensagensDeErro = mutableListOf<String>()

        // 2. Realizar as validações da senha
        // 2.1. Tamanho mínimo
        if (senha.length < 8) {
            mensagensDeErro.add("A senha deve ter no mínimo 8 caracteres.")
            senhaValida = false
        }

        // 2.2. Pelo menos uma letra maiúscula
        if (!senha.any { it.isUpperCase() }) {
            mensagensDeErro.add("A senha deve conter pelo menos uma letra maiúscula.")
            senhaValida = false
        }

        // 2.3. Pelo menos uma letra minúscula
        if (!senha.any { it.isLowerCase() }) {
            mensagensDeErro.add("A senha deve conter pelo menos uma letra minúscula.")
            senhaValida = false
        }

        // 2.4. Pelo menos um número
        if (!senha.any { it.isDigit() }) {
            mensagensDeErro.add("A senha deve conter pelo menos um número.")
            senhaValida = false
        }

        // Feedback para o usuário
        if (!senhaValida) {
            println("❌ Senha inválida! Por favor, corrija os seguintes pontos:")
            mensagensDeErro.forEach { println("- $it") }
            println("Tente novamente.")
        }

    } while (!senhaValida) // O loop continua enquanto a senha não for válida

    println("""
✅ Senha validada com sucesso! Você escolheu a senha: "$senha".
    """.trimIndent()) // trimIndent() remove o espaço extra causado pela indentação do código
}