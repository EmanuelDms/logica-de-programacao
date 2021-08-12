import 'funcionario.dart';

void main() {
  // Funcionario vendedor = Funcionario(null, null, null, 'Vendedor', 950);
  // print(vendedor.salario);
  // vendedor.comissao(10.25, 10);
  // print(vendedor.salario);

  Funcionario funcionario = Funcionario(1000, 100);
  funcionario.carrosVendidos = 2;
  print(funcionario.getSalarioFinal());
}
