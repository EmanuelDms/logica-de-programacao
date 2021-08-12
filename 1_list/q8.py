valorHora = eval(input("How much you receive per hour?\n=> "))
qtdHoras = eval(input("How many hours do you work?\n=> "))
mes = eval(input("How many days do you have in the month you work?\n=> "))
mes1 = mes * 24
salario = valorHora * (qtdHoras * mes1)

print("\nIn ", mes1," days you will receive R$", salario)