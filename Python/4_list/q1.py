aux = False 
while aux == False:
    nota = eval(input("Enter a value between 0 and 10: "))
    if nota > 0 and nota < 10:
        aux = True
    else:
        print("Invalid!")
