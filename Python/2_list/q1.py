n1 = eval(input("-> Enter a number: "))
n2 = eval(input("-> Enter another number: "))

if n1 > n2:
    maior = n1
    menor = n2
else:
    menor = n2
    maior = n1
print("* {} is bigger than {}.".format(str(maior).replace(".",","),str(menor).replace(".",",")))