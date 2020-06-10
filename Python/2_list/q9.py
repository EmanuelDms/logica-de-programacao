i = 0
num = []
while i <= 2:
    num.append(eval(input("* Enter a number {}: ".format(i+1))))
    i = i + 1

if num[0] > num[1] and num[0] > num[2]:
    key3 = 0
elif num[1] > num[0] and num[1] > num[2]:
    key3 = 1
else:
    key3 = 2

maior = num[key3]
num.pop(key3)

if num[0] < num[1]:
    key1 = 0
    key2 = 1
else:
    key1 = 1
    key2 = 0

menor = num[key1]
segundo = num[key2]
num.clear()
num.append(maior)
num.append(segundo)
num.append(menor)
for i in num:
    print("-> ",i)

