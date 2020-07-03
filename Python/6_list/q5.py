vetor = []
par = []
impar = []

i = 1
while i <= 20:
    vetor.append(int(input("Enter the number {}: ".format(i))))
    if vetor[i-1] % 2 == 0:
        par.append(vetor[i-1])
    else:
        impar.append(vetor[i-1])
    i = i + 1

print("\nNumbers: ")
for n in vetor:
    print(n, end=" | ")

print("\n\nEven Numbers: ")
for n in par:
    print(n, end=" | ")

print("\n\nOdds Numbers: ")
for n in impar:
    print(n, end=" | ")
    