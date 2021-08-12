print("\n!!! Prices !!!\n")
i = 0
num = []
while i <= 2:
    num.append(eval(input("* Produto {}: ".format(i+1))))
    i = i + 1

if num[0] < num[1] and num[0] < num[2]:
    menor = num[0]
elif num[1] < num[0] and num[1] < num[2]:
    menor = num[1]
else:
    menor = num[2]
    
print("Buy the product for R$",str(menor).replace('.',","))
