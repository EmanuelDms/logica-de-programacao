vowels = ['a','e','i','o','u']
letter = input("Type a letter: ")

req = False
for i in vowels:
    if letter.lower() == i:
        req = True

print("* Vowel" if req == True else "* Consoant")
print(" ->",letter)
    