i = 1
num = []
i = 1
while i <=5:
    num.append(eval(input("Enter number ({}) :".format(i))))
    i = i+1

if (num[0] >= num[1] and num[0] >= num[2] and num[0] >= num[3] and num[0] >= num[4]):
    big = num[0]
    num.pop(0)
elif num[1] >= num[0] and num[1] >= num[2] and num[1] >= num[3] and num[1] >= num[4]:
    big = num[1]
    num.pop(0)
elif num[2] >= num[1] and num[2] >= num[0] and num[2] >= num[3] and num[2] >= num[4]:
    big = num[2]
    num.pop(0)
elif num[3] >= num[0] and num[3] >= num[1] and num[3] >= num[2] and num[3] >= num[4]:
    big = num[3]
    num.pop(0) 
else:
    big = num[4]
    num.pop(0) 
print("Bigger:", big)