nameV = False
ageV = False
payV = False
genreV = False
state = False
while nameV == False:
    name = input("Name: ")
    aux = 0
    for i in name:
        aux = aux + 1
    if aux > 3:
        nameV = True
    else:
        print("3 characters at minimun!")

while ageV == False:
    age = eval(input("Age: "))
    if age >= 0 and age <= 150:
        ageV = True
    else:
        print("Age invalid!")

while payV == False:
    sal = eval(input("Salary: "))
    if sal > 0:
        payV = True
    else:
        print("Salary invalid!")

while genreV == False:
    genre = input("Genre: ")
    if genre == 'f' or genre == 'm':
        genreV = True
    else:
        print("Genre invalid!")

while state == False:
    stateD = input("Marital Status: ")
    if stateD == 's' or stateD == 'm' or stateD == 'w' or stateD == 'd':
        state = True
    else:
        print("Marital Status invalid!")
        