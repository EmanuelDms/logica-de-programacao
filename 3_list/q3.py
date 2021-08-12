n1 = eval(input("Number 1: "))
n2 = eval(input("Number 2: "))
media = (n1+n2)/2

if media >= 9 and media <= 10:
    conceito = "A"
elif media >= 7.5 and media < 9:
    conceito = "B"
elif media >= 6 and media < 7.5:
    conceito = "C"
elif media >= 4 and media < 6:
    conceito = "D"
elif media < 4:
    conceito = "E"

print("* ",conceito)
if conceito == 'A' or conceito == 'B' or conceito == 'C':
    print("- APPROVED")
else:
    print("- REPROVED")

print("+ Average: ",media)