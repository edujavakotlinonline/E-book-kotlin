class Usuario(val id: Int, val nome: String) {
    // Função membro de uma classe: 'apresentar'
    // Opera nos dados (id, nome) da instância de Usuario.
    fun apresentar() {
        println("Olá, meu ID é $id e meu nome é $nome.")
    }

    // Outra função membro que simula uma ação específica do usuário.
    fun logarNoSistema() {
        println("Usuário '$nome' (ID: $id) logou no sistema.")
    }
}

// Objeto singleton: 'GerenciadorConexaoBanco'
// Garante que só há uma instância do gerenciador de conexão em todo o aplicativo.
object GerenciadorConexaoBanco {
    private var conexaoAberta: Boolean = false

    // Função membro de um objeto singleton: 'obterConexao'
    // Esta função é acessada diretamente através do nome do objeto.
    fun obterConexao(): String {
        if (!conexaoAberta) {
            println("Abrindo nova conexão com o banco de dados...")
            // Simula a lógica real de conexão com o banco de dados
            Thread.sleep(200) // Simula atraso
            conexaoAberta = true
            return "Conexão estabelecida com sucesso."
        }
        return "Conexão já está aberta. Reutilizando..."
    }

    fun fecharConexao() {
        if (conexaoAberta) {
            println("Fechando conexão com o banco de dados.")
            conexaoAberta = false
        } else {
            println("Nenhuma conexão ativa para fechar.")
        }
    }
}

fun main() {
    // Exemplo de funções membro de uma classe (Usuario)
    val edu = Usuario(1, "Edu")
    edu.apresentar()       // Chamada através da instância: Olá, meu ID é 1 e meu nome é Edu.
    edu.logarNoSistema()   // Chamada através da instância: Usuário 'Edu' (ID: 1) logou no sistema.

    val maria = Usuario(2, "Maria")
    maria.apresentar()     // Olá, meu ID é 2 e meu nome é Maria.

    // Exemplo de função membro de um objeto singleton (GerenciadorConexaoBanco)
    println("\n--- Gerenciando Conexão com Banco de Dados ---")
    println(GerenciadorConexaoBanco.obterConexao()) // Primeira chamada: Abre a conexão
    println(GerenciadorConexaoBanco.obterConexao()) // Segunda chamada: Reutiliza a conexão
    GerenciadorConexaoBanco.fecharConexao()         // Fecha a conexão
    println(GerenciadorConexaoBanco.obterConexao()) // Nova chamada: Abre outra conexão
    GerenciadorConexaoBanco.fecharConexao()         // Fecha a conexão
}