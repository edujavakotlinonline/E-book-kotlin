fun verificarIdade(idade: Int) {
    if (idade >= 18) {
        println("Você é maior de idade.")
    }
}
fun main() {
    verificarIdade(20) // Saída: Você é maior de idade.
    verificarIdade(16) // Nenhuma saída
}