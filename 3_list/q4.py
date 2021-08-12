i = 1
lados = []
while i <= 3:
    lados.append(eval(input("Enter a number for the side {} :".format(i))))
    i = i+1
soma = lados[0] + lados[1]
soma1 = lados[0] + lados[2]
soma2 = lados[1] + lados[2]
if soma > lados[2] and soma1 > lados[1] and soma2 > lados[0]:
    if lados[0] == lados[1] and lados[0] == lados[2]:
        print("Equilateral!")
    else:
        darwin = False
        if lados[0] == lados[1] or lados[0] == lados[2]:
            darwin = True
        elif lados[1] == lados[0] or lados[1] == lados[2]:
            darwin = True
        elif lados[2] == lados[1] or lados[2] == lados[0]:
            darwin = True
        
        if darwin == True:
            print("Isosceles!")
        else:
            print("Scalene!")
else:   
    print("That isn't a triangle.")