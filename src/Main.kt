fun main () { // Gustavo da Costa Fontana
    print("Digite o nome do funcionario: ")
    val nome = readln()

    print("Digite o salario atual do funcionario: ")
    val salarioAtual = readln().toDouble()

    val aumento = 0.25
    val novoSalario = salarioAtual * (1 + aumento)

    println("Funcionario: $nome")
    println("Novo salario: R$ ${"%.2f".format(novoSalario)}")
}