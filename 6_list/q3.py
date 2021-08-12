notas = []
e = 1
soma = 0
while e <= 4:
    notas.append(eval(input("Note {}: ".format(e))))
    soma = soma + notas[e-1]
    e = e + 1

print("Average: {}".format(soma/(e-1)))
