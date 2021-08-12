// Moisés: https://github.com/moisesduartem

class Funcionario {
  double salario;
  double comissao;

  double carrosVendidos;
  double valorTotalDasVendas;

  Funcionario(double salario, double comissao) {
    this.salario = salario;
    this.comissao = comissao;
  }

  double getValorTotalDasVendas() {
    return this.carrosVendidos * this.comissao;
  }

  double getSalarioFinal() {
    return this.salario + this.getValorTotalDasVendas() * 0.05;
  }

  // Ler...
  // Numero de carros que ele vendeu
  // Valor POR CARRO VENDIDO
  // Valor TOTAL das vendas

  // Resposta: SALÁRIO FINAL!!!
}
