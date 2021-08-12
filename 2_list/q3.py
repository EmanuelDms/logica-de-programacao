letra = input("* Female (F) ou Male (M)? ->")

if letra == 'F':
    txt = 'Female'
elif letra == 'M':
    txt = 'Male'
else:
    txt = 'Invalid value!'

print("{} - {}".format(letra,txt))