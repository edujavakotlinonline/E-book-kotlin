fun saudar(nome: String, mensagem: String = "Olá") {
    println("$mensagem, $nome!")
}

fun main() {
    saudar("Edu")                     // Usa o valor padrão para mensagem: Olá, Edu!
    saudar("Maria", "Bom dia")        // Sobrescreve o valor padrão: Bom dia, Maria!
}