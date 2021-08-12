rep = False
while rep == False:
    verP = False
    while verP == False:
        a = eval(input("Population A: "))
        b = eval(input("Population B: "))
        if a > b:
            print("\nPopulation A must have to be smaller than B!")
        else:
            verP = True

    verT = False
    while verT == False:
        tA = eval(input("\nAs a percentage, enter...\nRate A: "))
        tB = eval(input("Rate B: "))
        if tA > tB:
            verT = True
        else:
            print("The Rate must have to be bigger than B!")
            
    i = 0
    while a < b:
        a = a + (a * tA/100)
        b = b + (b * tB/100)
        i = i + 1
    
    print("Will be necessary {} to A pass B.".format(i))
    check = False
    while check == False:
        op = input("\n[Repeat the program? (y -> yes | n -> no)]\n=>")
        check = True
        if op == 'y':
            print('ok!\n')
        elif op == 'n':
            rep = True
        else:
            print('Type a valid answer!\n')
            check = False
    
    
    
