fun tipoCaractere(char: Char) {
    when (char) {
        'a', 'e', 'i', 'o', 'u' -> println("É uma vogal.")
        in 'b'..'z' -> println("É uma consoante.")
        //Combinação com ranges
        else -> println("Não é uma letra.")
    }
}
fun main() {
    tipoCaractere('a') // Saída: É uma vogal.
    tipoCaractere('k') // Saída: É uma consoante.
    tipoCaractere('5') // Saída: Não é uma letra.
}
