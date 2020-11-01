/**
 * Atributos
 * - Nome
 * - CPF
 * - Idade
 */
class Pessoa {
  String nome;
  String cpf;
  int idade;

  Pessoa(this.nome, this.cpf, this.idade);

  void fazAniversario() {
    ++idade;
    print('$nome fez $idade!!!!');
  }
}
