a = 80000
b = 200000
i = 0
while a < b:
    a = a + (a * 0.03)
    b = b + (b * 0.015)
    i = i + 1
    
print("Will be necessary {} to A pass B.".format(i))
