fun main() {
    println("--- Processador de Notificações com 'when' Exaustivo e 'Enum' ---")
    println("Este programa demonstra como usar 'when' com um 'enum' para tratar todos os casos possíveis de forma segura.")

    println("\n--- Enviando Notificações ---")

    enviarNotificacao(TipoDeNotificacao.EMAIL)
    enviarNotificacao(TipoDeNotificacao.SMS)
    enviarNotificacao(TipoDeNotificacao.PUSH)
    enviarNotificacao(TipoDeNotificacao.WHATSAPP)

    println("\n--- Fim do Processador de Notificações ---")
}

/**
 * Define os tipos de notificação que o sistema pode enviar.
 * Uma `enum class` é ideal para um conjunto fixo de constantes.
 */
enum class TipoDeNotificacao {
    EMAIL,
    SMS,
    PUSH,
    WHATSAPP
}

/**
 * Simula o envio de uma notificação com base no seu tipo.
 *
 * @param tipo O [TipoDeNotificacao] a ser processado.
 */
fun enviarNotificacao(tipo: TipoDeNotificacao) {
    print("Processando notificação do tipo '$tipo': ")

    // O 'when' é usado aqui como uma expressão (retornando Unit neste caso, mas poderia retornar algo).
    // Por ser exaustivo, o compilador do Kotlin garante que todos os valores do enum são tratados.
    // Se você adicionar um novo tipo ao enum e esquecer de adicioná-lo aqui, o compilador dará um erro.
    when (tipo) {
        TipoDeNotificacao.EMAIL -> println("Enviando um e-mail para o usuário.")
        TipoDeNotificacao.SMS -> println("Enviando uma mensagem de texto (SMS).")
        TipoDeNotificacao.PUSH -> println("Enviando uma notificação push para o aplicativo móvel.")
        TipoDeNotificacao.WHATSAPP -> println("Enviando uma mensagem via WhatsApp.")
        // Não é necessário um 'else' aqui porque todos os membros do 'TipoDeNotificacao' são cobertos.
        // Se um novo membro for adicionado ao enum, o compilador nos avisará que este 'when' não é exaustivo.
    }
}