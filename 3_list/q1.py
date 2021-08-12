valorH = eval(input("Value per hour: "))
qtdH = eval(input("Amount of hours: "))
salarioB = valorH * qtdH

if salarioB <= 900:
    ir = 1
elif salarioB > 900 and salarioB <= 1500:
    ir = 5/100
elif salarioB > 1500 and salarioB <= 2500:
    ir = 10/100
else:
    ir = 20/100

ir_imposto = salarioB * ir
inss_imposto = salarioB * 0.10
fgts_imposto = salarioB * 0.11
sind_imposto = salarioB * 0.03
descontos = ir_imposto+inss_imposto+fgts_imposto+sind_imposto
salarioL = salarioB - descontos

print("Gross salary: R${}\Income tax ({}%): R${}".format(salarioB,ir*100,ir_imposto))
print("INSS (10%): R${}\nFGTS (11%): R${}".format(inss_imposto,fgts_imposto))
print("Union: R${}".format(sind_imposto))
print("Discounts: R${} | Salário Líquido: R${}".format(descontos,salarioL))