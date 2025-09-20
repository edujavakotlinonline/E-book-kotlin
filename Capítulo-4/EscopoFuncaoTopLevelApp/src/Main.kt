/**
 * Função Top-Level: 'calcularPorcentagem'.
 * Calcula a porcentagem de uma parte em relação a um total.
 * Pode ser usada por qualquer parte do seu código sem instanciar uma classe.
 */
fun calcularPorcentagem(parte: Double, total: Double): Double {
    if (total == 0.0) {
        return 0.0 // Evita divisão por zero
    }
    return (parte / total) * 100
}

// Uma classe qualquer que pode coexistir no mesmo arquivo, ou em outro.
class GerenciadorDeRelatorios {
    fun gerarRelatorioVendas() {
        // ... Lógica para gerar relatório ...
        println("Gerando relatório de vendas...")
    }
}

fun main() { // main também é uma função top-level
    println("--- Demonstração de Funções Top-Level ---")

    val vendasMensais = 15000.0
    val metaVendas = 20000.0

    // Chamando a função top-level diretamente
    val percentualAtingido = calcularPorcentagem(vendasMensais, metaVendas)
    println("Atingimos ${"%.2f".format(percentualAtingido)}% da meta de vendas.")
    // Saída: Atingimos 75.00% da meta de vendas.

    val usuariosAtivos = 750.0
    val totalUsuarios = 1000.0
    val percentualAtivos = calcularPorcentagem(usuariosAtivos, totalUsuarios)
    println("Temos ${"%.2f".format(percentualAtivos)}% de usuários ativos.")
    // Saída: Temos 75.00% de usuários ativos.

    // A classe existe, mas a função top-level não pertence a ela.
    val relatorio = GerenciadorDeRelatorios()
    relatorio.gerarRelatorioVendas() // Chamando uma função membro da classe
}