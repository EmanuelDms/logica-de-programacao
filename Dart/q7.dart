class Pessoa {
  int _idade;

  int get idade => _idade;
  set idade(int idade) => _idade = idade;

  void idadeEmDias(int meses, int dias) {
    int idadeEmDias = (30 * meses) + (365 * idade) + dias;
    print("$idadeEmDias dias.");
  }
}

void main() {
  Pessoa ob = Pessoa();
  ob.idade = 17;
  ob.idadeEmDias(11, 7);
}
