sealed class ResultadoOperacao {
    data class Sucesso(val mensagem: String) : ResultadoOperacao()
    data class Erro(val codigo: Int, val descricao: String) : ResultadoOperacao()
    object Carregando : ResultadoOperacao() // Singleton object
}

fun processarResultado(resultado: ResultadoOperacao): String {
    return when (resultado) { // 'when' como expressão, usando sealed class
        is ResultadoOperacao.Sucesso -> "Operação bem-sucedida: ${resultado.mensagem}"
        is ResultadoOperacao.Erro    -> "Falha: Código ${resultado.codigo} - ${resultado.descricao}"
        ResultadoOperacao.Carregando -> "Aguarde, processando..."
        // Não precisa de 'else' porque todos os subtipos diretos de ResultadoOperacao são cobertos.
        // Se um novo subtipo fosse adicionado e não tratado, daria erro de compilação.
    }
}

fun main() {
    val res1 = ResultadoOperacao.Sucesso("Dados carregados")
    val res2 = ResultadoOperacao.Erro(500, "Servidor indisponível")
    val res3 = ResultadoOperacao.Carregando

    println(processarResultado(res1)) // Saída: Operação bem-sucedida: Dados carregados
    println(processarResultado(res2)) // Saída: Falha: Código 500 - Servidor indisponível
    println(processarResultado(res3)) // Saída: Aguarde, processando...
}