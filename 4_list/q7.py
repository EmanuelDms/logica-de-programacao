
num = []
# The questions asks for 5 numbers, but you can do this
End = eval(input("Type a value for limit of numbers: "))
i = 1
while i <= End:
    num.append(eval(input("Enter number ({}) :".format(i))))
    i = i+1

# Counts the size of array
sizeNum = i - 1

j = 0
while j <= (sizeNum-1):
    predecessor = num[j-1]
    if predecessor != num[sizeNum - 1]:
        if num[j] >= predecessor:
            num[j] = num[j]
        else:
            num[j] = predecessor
    j = j + 1

print("Bigger:", num[sizeNum - 1])