n1 = eval(input("* Number 1: "))
n2 = eval(input("* Number 2: "))
average = (n1+n2)/2

if average >= 7 and average < 10:
    txt = 'Approved'
elif average < 7:
    txt = "Reproved"
else:
    txt = "Approved with Distinction"
print("-> {} | Average: ({})".format(txt,average))