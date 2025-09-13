fun descreverObjeto(obj: Any) { // 'Any' é o tipo raiz em Kotlin, como 'Object' em Java
    when (obj) {
        1 -> println("É o número um.")
        "Hello" -> println("É a String 'Hello'.")
        is Long -> println("É um Long de valor ${obj}") // Smart cast: 'obj' é tratado como Long aqui
        is String -> println("É uma String de comprimento ${obj.length}") // Smart cast: 'obj' é tratado como String aqui
        is Int -> println("É um Inteiro de valor $obj") // Smart cast: 'obj' é tratado como Int aqui
        else -> println("Tipo desconhecido ou outro valor.")
    }
}

fun main() {
    descreverObjeto(1)        // Saída: É o número um.
    descreverObjeto("Hello")  // Saída: É a String 'Hello'.
    descreverObjeto(100L)     // Saída: É um Long de valor 100
    descreverObjeto("Kotlin") // Saída: É uma String de comprimento 6
    descreverObjeto(200)      // Saída: É um Inteiro de valor 200
    descreverObjeto(true)     // Saída: Tipo desconhecido ou outro valor.
}