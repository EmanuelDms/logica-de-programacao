/**
 * Atributos
 * - Nome
 * - CPF
 * - Idade

class Pessoa {
// mudar idade para dtNascimento

  String _nome;
  String _cpf;
  int _idade;

  Pessoa(this.nome, this.cpf, this.idade);

  String get nome => _nome;

  String get cpf => _cpf;

  int get idade => _idade;

  set idade(int idade) => _idade = idade;

  set cpf(String cpf) => _cpf = cpf;

  set nome(String nome) => _nome = nome;

  void fazAniversario() {
    ++_idade;
    print('$nome fez $idade!!!!');
  }

  void idadeEmDias(int meses, int dias) {
    int idadeEmDias = (30 * meses) + (365 * idade) + dias;
    print("$idadeEmDias dias.");
  }
} */

int fibonacci(int n) {
  if (n == 0 || n == 1) return n;
  return fibonacci(n - 1) + fibonacci(n - 2);
}

int loop(int n) {
  if (n < 5) return n;
  return loop(n + 1);
}

main(List<String> args) {
  var result = fibonacci(3);
  // print(result);

  loop(4);
}
