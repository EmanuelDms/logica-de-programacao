/**
 * Ler o valor antecessor do teclado
 * - letras e números
 */

retornaAntecessor(dynamic value) {
  List<String> alpha = const [
    'a',
    'b',
    'c',
    'd',
    'e',
    'f',
    'g',
    'h',
    'i',
    'j',
    'k',
    'l',
    'm',
    'n',
    'o',
    'p',
    'q',
    'r',
    's',
    't',
    'u',
    'v',
    'w',
    'x',
    'y',
    'z'
  ];

  dynamic result;
  if (value is String) {
    int i = 0;
    for (var val in alpha) {
      result = (value == val) ? alpha[i - 1] : result;
      i++;
    }
  } else if (value is int) result = value - 1;

  return result ?? 'invalid';
}

void main() => print(retornaAntecessor(100));
