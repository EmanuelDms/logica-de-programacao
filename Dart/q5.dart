// Script que retorna antecessor

retornaAntecessor(dynamic inputValue, bool type, {dynamic object}) {
  // 0 => alfabeto | 1 => números

  dynamic result = inputValue;
  if (type) {
    var count = object.length;

    if (inputValue == object[0]) return 'Invalid Value';
    for (var i = 0; i < count; i++) {
      if (object[i] == inputValue) {
        result = object[i - 1];
      }
    }
    if (result == inputValue) return 'No character found';
    return result;
  }
  return result = result - 1;
}

void main() {
  // com alfabeto
  List<String> alfabeto = [
    'a',
    'b',
    'c',
    'd',
    'e',
    'f',
    'g',
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

  // Para números
  print(retornaAntecessor(12, false));

  // Para Alfabeto
  print(retornaAntecessor('f', true, object: alfabeto));
}
