// Define uma classe simples para representar um pagamento
data class Pagamento(val idTransacao: String, val valor: Double, var status: String)

/**
 * Função de Ordem Superior: 'processarPagamento'.
 * Ela simula o processamento de um pagamento e, após o sucesso, executa uma
 * ação de pós-processamento definida por uma lambda.
 *
 * @param pagamento O objeto Pagamento a ser processado.
 * @param acaoPosPagamento Uma lambda que recebe um Pagamento e não retorna nada (Unit).
 *                         Esta lambda define o que fazer após o pagamento ser "bem-sucedido".
 */
fun processarPagamento(pagamento: Pagamento, acaoPosPagamento: (Pagamento) -> Unit) {
    println("\n--- Iniciando processamento do pagamento ${pagamento.idTransacao} (Valor: R$ ${pagamento.valor}) ---")

    // Simulação de lógica de processamento de pagamento
    println("Verificando credenciais e saldo...")
    Thread.sleep(500) // Simula um atraso de processamento

    if (pagamento.valor > 0) { // Simples validação
        pagamento.status = "APROVADO"
        println("Pagamento ${pagamento.idTransacao} APROVADO!")
        acaoPosPagamento(pagamento) // EXECUTA A LAMBDA DE PÓS-PROCESSAMENTO
    } else {
        pagamento.status = "REJEITADO"
        println("Pagamento ${pagamento.idTransacao} REJEITADO (valor inválido)!")
    }

    println("--- Processamento finalizado ---\n")
}

fun main() {
    val pagamento1 = Pagamento("TRANS_001", 150.75, "PENDENTE")
    val pagamento2 = Pagamento("TRANS_002", 500.00, "PENDENTE")
    val pagamento3 = Pagamento("TRANS_003", 0.00, "PENDENTE") // Pagamento com valor inválido

    // Cenário 1: Pagamento APROVADO com envio de E-MAIL de confirmação
    println(">>> Processando Pagamento 1: Enviar Email de Confirmação")
    processarPagamento(pagamento1) { p -> // A lambda recebe o 'Pagamento' processado
        println("  [EMAIL] Enviando e-mail de confirmação para o cliente. ID: ${p.idTransacao}, Status: ${p.status}")
        // Aqui, p.status já seria 'APROVADO'
    }


    // Cenário 2: Pagamento APROVADO com envio de SMS para o cliente e notificação interna
    println(">>> Processando Pagamento 2: Enviar SMS e Notificação Interna")
    processarPagamento(pagamento2) { p -> // Outra lambda para outra ação
        println("  [SMS] Enviando SMS de confirmação para o cliente. ID: ${p.idTransacao}")
        println("  [LOG] Registrando evento interno de pagamento aprovado. ID: ${p.idTransacao}")
    }

    // Cenário 3: Pagamento REJEITADO (a lambda de pós-processamento não será executada)
    println(">>> Processando Pagamento 3: Teste de Pagamento Rejeitado")
    processarPagamento(pagamento3) { p ->
        // Esta lambda não será executada porque o pagamento foi rejeitado
        println("  [ALERTA] Este pagamento foi rejeitado, a ação de pós-processamento não deve ocorrer.")
    }

    println("\n--- Demonstração Completa de Fluxos de Pagamento Flexíveis ---")
    println("Este exemplo mostra como Funções de Ordem Superior e Lambdas permitem " +
            "reutilizar a lógica central (processarPagamento) e personalizar as ações subsequentes " +
            "de forma limpa e modular em um sistema de pagamentos!")
}