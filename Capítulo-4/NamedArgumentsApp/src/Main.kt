fun configurarPerfilUsuario(
    nome: String,
    email: String,
    idade: Int = 18, // Argumento padrão: idade mínima é 18
    statusOnline: Boolean = true, // Argumento padrão: usuário está online por padrão
    temaPreferido: String = "claro" // Argumento padrão: tema padrão é claro
) {
    println("--- Configuração de Perfil ---")
    println("Nome: $nome")
    println("Email: $email")
    println("Idade: $idade")
    println("Status Online: $statusOnline")
    println("Tema Preferido: $temaPreferido")
    println("----------------------------")
}

fun main() {
    // 1. Chamada básica: Apenas os argumentos obrigatórios são fornecidos.
    //    'idade', 'statusOnline' e 'temaPreferido' usarão seus valores padrão.
    println("Exemplo 1: Configuração Básica")
    configurarPerfilUsuario("João Silva", "joao.silva@example.com")

    // 2. Sobrescrevendo alguns argumentos padrão:
    //    'idade' é alterada, 'statusOnline' e 'temaPreferido' usam seus valores padrão.
    println("\nExemplo 2: Sobrescrevendo Idade")
    configurarPerfilUsuario("Maria Souza", "maria.souza@example.com", 25)

    // 3. Usando argumentos nomeados para alterar a ordem e sobrescrever valores específicos:
    //    'temaPreferido' é alterado para "escuro", 'statusOnline' para 'false'.
    //    A ordem dos parâmetros nomeados é diferente da declaração da função.
    println("\nExemplo 3: Usando Argumentos Nomeados")
    configurarPerfilUsuario(
        email = "ana.lima@example.com",
        nome = "Ana Lima",
        temaPreferido = "escuro",
        statusOnline = false
        // 'idade' não é especificada, então usa o valor padrão (18)
    )

    // 4. Chamada mais completa usando argumentos nomeados para todos os parâmetros:
    //    Melhora a legibilidade mesmo para argumentos não-padrão.
    println("\nExemplo 4: Configuração Completa com Nomeados")
    configurarPerfilUsuario(
        nome = "Carlos Dantas",
        email = "carlos.d@example.com",
        idade = 40,
        statusOnline = true,
        temaPreferido = "azul"
    )
}