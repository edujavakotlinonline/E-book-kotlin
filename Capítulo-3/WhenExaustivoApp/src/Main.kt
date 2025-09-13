enum class StatusPedido {
    PROCESSANDO,
    ENVIADO,
    ENTREGUE,
    CANCELADO
}

fun obterMensagemStatus(status: StatusPedido): String {
    return when (status) { // 'when' como expressão, usando enum
        StatusPedido.PROCESSANDO -> "Seu pedido está sendo processado."
        StatusPedido.ENVIADO     -> "Seu pedido foi enviado!"
        StatusPedido.ENTREGUE    -> "Seu pedido foi entregue com sucesso."
        StatusPedido.CANCELADO   -> "Seu pedido foi cancelado."
        // Não precisa de 'else' porque todos os valores de StatusPedido são cobertos.
        // Se um novo StatusPedido fosse adicionado e não tratado aqui, daria erro de compilação.
    }
}

fun main() {
    println(obterMensagemStatus(StatusPedido.ENVIADO))   // Saída: Seu pedido foi enviado!
    println(obterMensagemStatus(StatusPedido.ENTREGUE))  // Saída: Seu pedido foi entregue com sucesso.
}
