ver = False
while ver == False:
    print("------------------")
    nome = input("* Username: ")
    senha = input("* Password: ")
    if senha == nome:
        print("username is equal password!")
    else:
        ver = True