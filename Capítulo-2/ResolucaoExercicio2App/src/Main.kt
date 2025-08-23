fun main() {
    // 1. Declare uma variável val para o nome de usuário esperado
    val nomeUsuarioEsperado = "admin"

    // 2. Declare uma variável val para a senha esperada
    val senhaEsperada = "senha123"

    // --- Primeiro Cenário: Credenciais corretas e conta ativa ---

    // 3. Declare uma variável var para o nome de usuário fornecido pelo usuário
    var nomeUsuarioFornecido = "admin"

    // 4. Declare uma variável var para a senha fornecida pelo usuário
    var senhaFornecida = "senha123"

    // 5. Declare uma variável val para indicar se a conta do usuário está ativa
    val contaAtivaCenario1 = true // Cenário inicial: conta ativa

    // 6. Usando operadores de comparação e lógicos, crie uma expressão booleana
    val acessoConcedidoCenario1 = (nomeUsuarioFornecido == nomeUsuarioEsperado) &&
            (senhaFornecida == senhaEsperada) &&
            contaAtivaCenario1

    // 7. Imprima uma mensagem indicando se o acesso foi concedido ou negado.
    println("--- Cenário 1: Credenciais Corretas e Conta Ativa ---")
    println("Status da Conta: ${if (contaAtivaCenario1) "Ativa" else "Inativa"}")
    println("Nome de Usuário Fornecido: $nomeUsuarioFornecido")
    println("Senha Fornecida: $senhaFornecida")
    println("Acesso Concedido: $acessoConcedidoCenario1") // Saída Esperada: true

    // 8. Experimente alterar as variáveis para ver diferentes resultados.

    // --- Segundo Cenário: Senha incorreta ---
    println("\n--- Cenário 2: Senha Incorreta ---")
    nomeUsuarioFornecido = "admin"           // Mantém usuário correto
    senhaFornecida = "senhaIncorreta"       // Altera a senha
    val contaAtivaCenario2 = true           // Mantém conta ativa

    val acessoConcedidoCenario2 = (nomeUsuarioFornecido == nomeUsuarioEsperado) &&
            (senhaFornecida == senhaEsperada) &&
            contaAtivaCenario2

    println("Status da Conta: ${if (contaAtivaCenario2) "Ativa" else "Inativa"}")
    println("Nome de Usuário Fornecido: $nomeUsuarioFornecido")
    println("Senha Fornecida: $senhaFornecida")
    println("Acesso Concedido: $acessoConcedidoCenario2") // Saída Esperada: false

    // --- Terceiro Cenário: Conta inativa ---
    println("\n--- Cenário 3: Conta Inativa ---")
    nomeUsuarioFornecido = "admin"
    senhaFornecida = "senha123"
    val contaAtivaCenario3 = false          // Altera a conta para inativa

    val acessoConcedidoCenario3 = (nomeUsuarioFornecido == nomeUsuarioEsperado) &&
            (senhaFornecida == senhaEsperada) &&
            contaAtivaCenario3

    println("Status da Conta: ${if (contaAtivaCenario3) "Ativa" else "Inativa"}")
    println("Nome de Usuário Fornecido: $nomeUsuarioFornecido")
    println("Senha Fornecida: $senhaFornecida")
    println("Acesso Concedido: $acessoConcedidoCenario3") // Saída Esperada: false

    // --- Quarto Cenário: Nome de usuário incorreto ---
    println("\n--- Cenário 4: Nome de Usuário Incorreto ---")
    nomeUsuarioFornecido = "administrador"  // Altera o nome de usuário
    senhaFornecida = "senha123"
    val contaAtivaCenario4 = true           // Mantém conta ativa

    val acessoConcedidoCenario4 = (nomeUsuarioFornecido == nomeUsuarioEsperado) &&
            (senhaFornecida == senhaEsperada) &&
            contaAtivaCenario4

    println("Status da Conta: ${if (contaAtivaCenario4) "Ativa" else "Inativa"}")
    println("Nome de Usuário Fornecido: $nomeUsuarioFornecido")
    println("Senha Fornecida: $senhaFornecida")
    println("Acesso Concedido: $acessoConcedidoCenario4") // Saída Esperada: false

    // --- Quinto Cenário: Todos os campos incorretos/inativos ---
    println("\n--- Cenário 5: Todos Incorretos/Inativos ---")
    nomeUsuarioFornecido = "user123"
    senhaFornecida = "abc"
    val contaAtivaCenario5 = false

    val acessoConcedidoCenario5 = (nomeUsuarioFornecido == nomeUsuarioEsperado) &&
            (senhaFornecida == senhaEsperada) &&
            contaAtivaCenario5

    println("Status da Conta: ${if (contaAtivaCenario5) "Ativa" else "Inativa"}")
    println("Nome de Usuário Fornecido: $nomeUsuarioFornecido")
    println("Senha Fornecida: $senhaFornecida")
    println("Acesso Concedido: $acessoConcedidoCenario5") // Saída Esperada: false
}