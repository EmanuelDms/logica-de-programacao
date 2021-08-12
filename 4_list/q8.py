num = []
i = 1
aux = 0
while i <=5:
    num = eval(input("Enter number ({}) :".format(i)))
    aux = aux + num
    i = i + 1
print("Sum: {}".format(aux))
print("Avg: {}".format(aux/(i-1)))