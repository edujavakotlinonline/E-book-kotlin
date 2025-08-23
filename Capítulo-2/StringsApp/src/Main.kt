fun main() {
    // --- Strings Simples e Multi-linhas ---
    val mensagemSimples = "Olá, Kotlin!"
    val mensagemComQuebraDeLinha = "Primeira linha.\nSegunda linha."

    println("--- Strings Simples e Multi-linhas ---")
    println("Mensagem Simples: $mensagemSimples")
    println("Mensagem com Quebra de Linha:\n$mensagemComQuebraDeLinha")

    val jsonPayload = """
        {
        "nome": "Edu",
        "linguagem": "Kotlin"
        }
        """.trimIndent() // trimIndent() remove a indentação comum
    println("\n--- JSON Payload (Raw String) ---")
    println(jsonPayload)

    // --- Interpolação de Strings com Variáveis Simples ---
    val nome = "Edu"
    val idade = 30
    val saudacao = "Olá, meu nome é $nome e eu tenho $idade anos."

    println("\n--- Interpolação de Strings (Variáveis Simples) ---")
    println("Variável 'nome': $nome")
    println("Variável 'idade': $idade")
    println("Saudação: $saudacao") // Saída: Olá, meu nome é Edu e eu tenho 30 anos.

    // --- Interpolação de Strings com Expressões ---
    val precoUnitario = 10.50
    val quantidade = 3
    val total = "O total da compra é R\$ ${precoUnitario * quantidade}."

    println("\n--- Interpolação de Strings (Expressões) ---")
    println("Preço Unitário: $precoUnitario")
    println("Quantidade: $quantidade")
    println("Total da Compra: $total") // Saída: O total da compra é R\$ 31.5.

    // --- Manipulação de Strings com Métodos e Interpolação ---
    val nomeCompleto = "Maria da Silva"
    val iniciais = "Iniciais: ${nomeCompleto.substring(0, 1).toUpperCase()}${nomeCompleto.substring(6, 7).toUpperCase()}"

    println("\n--- Manipulação e Interpolação de Strings ---")
    println("Nome Completo: $nomeCompleto")
    println("Iniciais Calculadas: $iniciais") // Saída: Iniciais: MD
}