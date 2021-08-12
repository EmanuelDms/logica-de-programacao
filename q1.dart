class defaultValues {
  static int A = 10;
  static int B = 20;
}

void main() {
  int A = defaultValues.A;
  int B = defaultValues.B;
  print("Before: $A e $B");
  int C = A;
  A = B;
  B = C;
  print("After: $A e $B");
}
