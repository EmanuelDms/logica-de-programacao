/**
 * Atributos
 * - Marca
 * - Modelo
 * - Placa
 * 
 * Métodos
 * - buzinar
 */
abstract class Veiculo {
  String marca;
  String modelo;
  String placa;

  Veiculo(this.marca, this.modelo, this.placa);

  void buzinar();
}
