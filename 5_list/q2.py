i = 0
par = 0
impar = 0
while i <= 9:
    num = eval(input('Informe o número {}: '.format(i+1)))
    if num % 2 == 0:
        par = par + 1
    else:
        impar = impar + 1
    i = i + 1
print("* Temos {} pares e {} ímpares.".format(par,impar))
