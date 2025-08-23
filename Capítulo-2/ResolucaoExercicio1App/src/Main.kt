fun main() {
    // 1. Declare as variáveis conforme as especificações, agora em português

    // Variável val para o nome do produto
    val nomeProduto: String = "Laptop Pro X"

    // Variável var para a quantidade em estoque (precisa ser 'var' pois será atualizada)
    var quantidadeEmEstoque: Int = 15

    // Variável val para o preço unitário do produto
    val precoUnitario: Double = 2500.75

    // Armazenamos a quantidade inicial para poder mostrá-la na saída,
    // pois 'quantidadeEmEstoque' será modificada.
    val quantidadeEstoqueInicial: Int = quantidadeEmEstoque

    // 4. Simule a venda de 3 unidades do produto

    val unidadesVendidas: Int = 3

    // Atualize a quantidade em estoque usando um operador de atribuição
    quantidadeEmEstoque -= unidadesVendidas // Equivalente a: quantidadeEmEstoque = quantidadeEmEstoque - unidadesVendidas

    // Calcule o valor total da venda dessas 3 unidades
    val totalVenda: Double = unidadesVendidas * precoUnitario

    // 5. Imprima todas as informações atualizadas para o console
    //    Use String Templates para formatar a saída.

    println("--- Detalhes do Produto ---")
    println("Produto: $nomeProduto")
    // Formatação para 2 casas decimais para valores monetários
    println("Preço Unitário: R\$ ${"%.2f".format(precoUnitario)}")
    println("Estoque Inicial: $quantidadeEstoqueInicial unidades")

    println("\n--- Simulação de Venda ---") // Adiciona uma linha em branco para separação
    println("Quantidade Vendida: $unidadesVendidas unidades")
    println("Estoque Restante: $quantidadeEmEstoque unidades")
    // Formatação para 2 casas decimais para o valor total
    println("Valor Total da Venda: R\$ ${"%.2f".format(totalVenda)}")
}