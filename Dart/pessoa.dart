/**
 * Atributos
 * - Nome
 * - CPF
 * - Idade
 */
class Pessoa {
// mudar idade para dtNascimento

  String _nome;
  String _cpf;
  int _idade;

  Pessoa(nome, cpf, idade);

  String get nome => _nome;

  String get cpf => _cpf;

  int get idade => _idade;

  set idade(int idade) => _idade;

  void fazAniversario() {
    ++idade;
    print('$nome fez $idade!!!!');
  }
}
