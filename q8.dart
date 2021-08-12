void main() => porcentagensVotos(52, 29, 1);
void porcentagensVotos(int brancos, int nulos, int validos) {
  int totalEleitores = brancos + nulos + validos;

  double porcentBrancos =
      num.parse(((brancos * 100) / totalEleitores).toStringAsFixed(1));

  double porcentNulos =
      num.parse(((nulos * 100) / totalEleitores).toStringAsFixed(1));

  double porcentValidos =
      num.parse(((validos * 100) / totalEleitores).toStringAsFixed(1));

  print('Total: $totalEleitores');
  print(
      '-> ${(porcentBrancos.toString()).replaceAll('.', ',')}% votos brancos.');
  print('-> ${(porcentNulos.toString()).replaceAll('.', ',')}% votos nulos.');
  print(
      '-> ${(porcentValidos.toString()).replaceAll('.', ',')}% votos válidos.');
}
