num = eval(input("* Enter a integer number: "))
i = num
aux = 1
print("{}! = ".format(i),end='')
while 1 <= i:
    if i == 1:
        print(i," = ", end='')
    else:
        print(i," * ", end='')
    aux = aux * i
    i = i - 1 
print(aux)