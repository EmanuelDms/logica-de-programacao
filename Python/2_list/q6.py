i = 0
num = []
while i <= 2:
    num.append(eval(input("* Enter a number {}: ".format(i+1))))
    i = i + 1

if num[0] > num[1] and num[0] > num[2]:
    maior = num[0]
elif num[1] > num[0] and num[1] > num[2]:
    maior = num[1]
else:
    maior = num[2]
print("The biggest value: ",maior)