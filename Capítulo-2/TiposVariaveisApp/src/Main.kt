fun main() {
    // --- Variáveis Numéricas ---
    val idadeDoUsuario: Int = 25
    val populacaoMundial: Long = 8_000_000_000L // O '_' ajuda na legibilidade para números grandes
    val temperatura: Float = 25.5f
    val precoProduto: Double = 99.99

    println("--- Variáveis Numéricas ---")
    println("Idade do Usuário (Int): $idadeDoUsuario")
    println("População Mundial (Long): $populacaoMundial")
    println("Temperatura (Float): $temperatura")
    println("Preço do Produto (Double): $precoProduto")

    // --- Variáveis Booleanas ---
    val isLoggedIn: Boolean = true
    val isAccountActive = false // Inferência de tipo

    println("\n--- Variáveis Booleanas ---") // Adicionando uma quebra de linha para separar
    println("Está Logado (Boolean): $isLoggedIn")
    println("Conta Ativa (Boolean - inferido): $isAccountActive")

    // --- Variáveis Caractere ---
    val primeiraInicial: Char = 'E'
    val simboloMoeda = '$' // Inferência de tipo

    println("\n--- Variáveis Caractere ---") // Adicionando uma quebra de linha para separar
    println("Primeira Inicial (Char): $primeiraInicial")
    println("Símbolo de Moeda (Char - inferido): $simboloMoeda")
}