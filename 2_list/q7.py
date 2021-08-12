i = 0
num = []
while i <= 2:
    num.append(eval(input("* Enter a number {}: ".format(i+1))))
    i = i + 1

if num[0] > num[1] and num[0] > num[2]:
    key = 0
elif num[1] > num[0] and num[1] > num[2]:
    key = 1
else:
    key = 2

maior = num[key]
num.pop(key)

if num[0] > num[1]:
    menor = num[1]
else:
    menor = num[0]

print("\n+ Bigger -> {} \n+ Smaller -> {}".format(maior,menor))