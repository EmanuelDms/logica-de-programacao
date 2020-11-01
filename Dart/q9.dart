import 'pessoa.dart';

/**
 * Exibir
 * - Dados do Funcionário (Nome && CPF)
 * 
 * Calcular
 * - Salário mensal de um funcionário
 * - Percentual de reajuste
 */
class Funcionario extends Pessoa {
  String cargo;
  double salario;

  Funcionario(String nome, String cpf, int idade, this.cargo, this.salario)
      : super(nome, cpf, idade);

  @override
  String toString() {
    String txt =
        "Nome: $nome\nCPF: $cpf\nIdade: $idade\nCargo: $cargo\nSalario: $salario\n";
    return txt;
  }

  double reajusteSalarial(double percent) {
    salario = salario + (salario * percent / 100);
    print('Reajuste Salarial de ${percent}%!\n${toString()}');
    return salario;
  }
}

void main(List<String> args) {
  Funcionario Emanuel =
      Funcionario('Emanuel', '0000000', 18, 'Programador', 650.25);
  print(Emanuel);
  Emanuel.reajusteSalarial(2);
  Emanuel.fazAniversario();
}
