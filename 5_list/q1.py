base = eval(input("* Enter the base: "))
expoente = eval(input("* Enter the expoent: "))
i = 1
aux = 1
if expoente != 0:
    while i <= expoente:
        if i == expoente:
            print(base," = ", end='')
        else:
            print(base, " * ", end='')
        aux = aux * base
        i = i + 1    
print(aux)
