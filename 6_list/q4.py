# Estou considerando que cada caractere, dos 10, é um item no vetor
vowels = ['a','e','i','o','u']
vetor = []

i = 1
cont = 0
while i <= 10:
    vetor.append(input("Enter the caracter {}: ".format(i)))
    for l in vowels:
        if vetor[i-1] == l:
            cont = cont + 1
    i = i + 1

consoant = 10 - cont
print("Consoants: {}".format(consoant))