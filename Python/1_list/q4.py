#Creating array with four numbers
notas = [0] * 4
cont = 0
for i in notas:
    print("Number ", (cont+1), ":")
    notas[cont] = eval(input("=> "))
    cont = cont + 1

cont = 0
soma = 0
for i in notas:
    soma = soma + notas[cont]
    cont = cont + 1
media = soma/4
print("The average is: ", media)
