vetor = []

i = 1
while i <= 10:
    vetor.append(eval(input('Enter a real number {}: '.format(i))))
    i = i + 1

j = 10
while j >= 1:
    print("| {}".format(vetor[j-1]), end=" ")
    j = j - 1 