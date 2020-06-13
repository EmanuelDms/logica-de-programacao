a = eval(input("* Enter the value of A: "))
if a == 0:
    print("!! Isn't a second degree equation!!!")
else:
    b = eval(input("* Enter a value for B: "))
    c = eval(input("* Enter a value for C: "))
    delta = (b ** 2)-4*a*c 
    if delta < 0: 
        print("!! Has no real roots !!!")
    else:
        n = 1/2
        radiciacao = delta ** n
        x_1 = ((-1 * b) + radiciacao)/(2*a)
        x_2 = ((-1 * b) - radiciacao)/(2*a)
        print("X1 = ",x_1)
        print("X2 = ",x_2)
