// Lambda para somar dois inteiros
val somarNumeros: (Int, Int) -> Int = { a, b -> a + b }

// Lambda que não recebe parâmetros e retorna uma String
val saudacao: () -> String = { "Olá, Kotlin!" }

// Lambda com um único parâmetro, usando 'it'
val duplicar: (Int) -> Int = { it * 2 }

fun main() {
    println(somarNumeros(8, 2)) // Saída: 10
    println(saudacao())        // Saída: Olá, Kotlin!
    println(duplicar(5))       // Saída: 10

    // Uso de lambda como último argumento de função (trailing lambda)
    // Se a lambda é o último argumento, pode ser colocada fora dos parênteses da função.
    val lista = listOf(1, 2, 3, 4, 5)
    val pares = lista.filter { numero -> numero % 2 == 0 } // A lambda define o critério de filtro
    println(pares) // Saída: [2, 4]

    // Se a lambda tem apenas um parâmetro, 'it' pode ser usado implicitamente
    val impares = lista.filter { it % 2 != 0 }
    println(impares) // Saída: [1, 3, 5]
}