import 'dart:convert';

import 'q1.dart';

void main() {
  int A = defaultValues.A;
  int B = defaultValues.B;
  // a)
  print('a)\n$B');
  B = 5;
  print("$A, $B");

  // b)
  B = 20;
  A = B + 10;
  int C = A + B;
  print('\nb)\n$C'); // 50
  B -= 10;
  print("$B, $C"); // 10, 50
  C = A + B; // 40
  print("$A, $B, $C");

  // c)
  A -= 20;
  B += 10;
  C = A;
  B = C;
  A = B;
  print("\nc)\n$A, $B, $C");

  // d)
  B = A + 1; // A: 10 B: 11
  A = B + 1; // A: 12 B: 11
  B = A + 1; // A: 12 B: 13
  print("\nd)\n$A");
  A = B + 1; // A: 14 B: 13
  print("$A, $B");

  // e)
  A -= 4;
  B = 5;
  C = A + B;
  B += 15;
  // A = 10;
  print("\ne)\n$A, $B, $C");

  // f)
  int X = 1;
  int Y = 2;
  int Z = Y - X;
  print(Z); // 1
  X += 4;
  Y = X + Z;
  print("\nf)\n$X, $Y, $Z");
}
