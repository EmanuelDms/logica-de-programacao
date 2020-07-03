i = 1
num = []
aux = False
while i <= 20:
    if aux == False:
        print(i)
        if i == 20:
            aux = True
            i = 0
    else:
        #python 3.x
        print(" |",i, end='')
    i = i + 1
print('\n')