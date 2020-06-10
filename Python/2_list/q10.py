print("M - Morning\Afternoon -\nN - Night\n")
turno = input("Shift you study: ")
turno = turno.upper()

if turno == 'M':
    print("Good Morning!")
elif turno == 'V':
    print("Good Afternoon!")
elif turno == 'N':
    print("Good Night!")
else:
    print("Invalid!")