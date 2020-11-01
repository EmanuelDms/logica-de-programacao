import 'veiculo.dart';

/**
 * Atributos
 * marca (veiculo), 
 * modelo (veiculo), 
 * placa (veiculo), 
 * numeroPortas
 */
class Carro extends Veiculo {
  int numeroPortas;
  static double CustoDoCarro;
  double _CustoDoCarroFabrica;

  Carro(String marca, String modelo, String placa, this.numeroPortas)
      : super(marca, modelo, placa);

  set CustoDoCarroFabrica(double CustoDoCarroFabrica) =>
      _CustoDoCarroFabrica = CustoDoCarroFabrica;

  double get CustoDoCarroFabrica => _CustoDoCarroFabrica;

  /**
   * Custo do Carro (soma)
   * - CustoDeFabrica
   * - percentualImpostos
   * - percentualDistribuidor
  */
  void CustoFinal(
    double CustoDoCarroFabrica,
    double percentualImpostos,
    double percentualDistribuidor,
  ) {
    this.CustoDoCarroFabrica = CustoDoCarroFabrica;
    double result = CustoDoCarroFabrica +
        (CustoDoCarroFabrica * percentualImpostos / 100) +
        (CustoDoCarroFabrica * percentualDistribuidor / 100);

    CustoDoCarro = result;
    print(toString());
  }

  @override
  void buzinar() => 'vroom!!!';

  @override
  String toString() {
    String txt =
        "Marca: $marca\nModelo: $modelo\nPlaca: $placa\nNúmero de Portas: $numeroPortas\nCusto de Fábrica: ${CustoDoCarroFabrica.toString().replaceAll('.', ',')}\nCusto Final: ${CustoDoCarro.toString().replaceAll('.', ',')}";
    return txt;
  }
}

void main() {
  Carro cruze = Carro('Chevrolet', 'Cruze', 'EAD-123', 4);
  cruze.CustoFinal(600.25, 45, 28);
}
