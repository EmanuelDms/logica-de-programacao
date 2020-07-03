vetor = []
i = 1
while i <= 5:
    vetor.append(int(input('Enter a integer number {}: '.format(i))))
    i = i + 1

j = 1
for i in vetor:
    print('| Index {}: {}'.format(j,i), end=' ')
    j = j + 1