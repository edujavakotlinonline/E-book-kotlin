fun main() {
    // --- Operadores Aritméticos ---
    println("--- Demonstração de Operadores Aritméticos ---")
    val a = 20
    val b = 7
    println("Valores: a = $a, b = $b")
    println("Soma (a + b): ${a + b}") // Saída Esperada: 27
    println("Subtração (a - b): ${a - b}") // Saída Esperada: 13
    println("Multiplicação (a * b): ${a * b}") // Saída Esperada: 140
    println("Divisão (Int) (a / b): ${a / b}") // Saída Esperada: 2 (resultado inteiro)
    println("Divisão (Double) (a.toDouble() / b): ${a.toDouble() / b}") // Saída Esperada: 2.857...
    println("Módulo (Resto da Divisão) (a % b): ${a % b}") // Saída Esperada: 6

    // --- Operadores de Comparação ---
    println("\n--- Demonstração de Operadores de Comparação ---")
    val x = 15
    val y = 20
    println("Valores: x = $x, y = $y")
    println("x é igual a y (x == y)? ${x == y}") // Saída Esperada: false
    println("x é diferente de y (x != y)? ${x != y}") // Saída Esperada: true
    println("x é menor que y (x < y)? ${x < y}") // Saída Esperada: true
    println("y é maior que x (y > x)? ${y > x}") // Saída Esperada: true
    println("x é menor ou igual a y (x <= y)? ${x <= y}") // Saída Esperada: true
    println("y é maior ou igual a x (y >= x)? ${y >= x}") // Saída Esperada: true

    // --- Operadores Lógicos ---
    println("\n--- Demonstração de Operadores Lógicos ---")
    val temPermissao = true
    val isAdministrador = false
    println("Valores: temPermissao = $temPermissao, isAdministrador = $isAdministrador")
    println("Pode acessar (Permissão E Administrador - temPermissao && isAdministrador)? ${temPermissao && isAdministrador}") // Saída Esperada: false
    println("Pode acessar (Permissão OU Administrador - temPermissao || isAdministrador)? ${temPermissao || isAdministrador}") // Saída Esperada: true
    println("Não tem permissão (!temPermissao)? ${!temPermissao}") // Saída Esperada: false

    // --- Operadores de Atribuição Composta ---
    println("\n--- Demonstração de Operadores de Atribuição Composta ---")
    var saldoConta = 1000.0
    println("Saldo inicial: $saldoConta") // Saída Esperada: 1000.0
    saldoConta += 500.0 // saldoConta = 1000.0 + 500.0 = 1500.0
    println("Saldo após depósito (saldoConta += 500.0): $saldoConta") // Saída Esperada: 1500.0
    saldoConta -= 200.0 // saldoConta = 1500.0 - 200.0 = 1300.0
    println("Saldo após saque (saldoConta -= 200.0): $saldoConta") // Saída Esperada: 1300.0

    var contador = 10
    println("Contador inicial: $contador") // Saída Esperada: 10
    contador *= 2 // contador = 10 * 2 = 20
    println("Contador duplicado (contador *= 2): $contador") // Saída Esperada: 20
    contador /= 5 // contador = 20 / 5 = 4
    println("Contador dividido (contador /= 5): $contador") // Saída Esperada: 4
    contador %= 3 // contador = 4 % 3 = 1
    println("Contador módulo (contador %= 3): $contador") // Saída Esperada: 1
}