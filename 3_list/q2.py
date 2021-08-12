#Obs: Escolhi um mês de 31 dias com o dia 1 sendo Domingo
num = int(input("Enter a number between one and thirty-one: "))

if num >= 1 and num <= 31:
    dias = ['Sunday',"Monday", "Tuesday", "Wednesday", "Thursday","Friday","Saturday"]
    mes = []

    i = 1
    aux = 0
    while i <= 31:
        if aux == 7:
            aux = 0

        mes.append(dias[aux])

        if num == i:
            print("Day ",num," is ",mes[i-1])

        i = i+1
        aux = aux + 1
else:
    print("Value invalid!")
