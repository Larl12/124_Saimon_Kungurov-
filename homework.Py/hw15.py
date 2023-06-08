from random import randint

n = randint(1, 100)
count = 1
flag = True
while flag:
  num = int(input('Введите число: '))
  if num != n:
    count += 1
    if num < n:
      print('Ваше число меньше')
    if num > n:
      print('Ваше число больше')
  else:
    print('Правильно!')
    flag = False

s = f'Попытки: {count}, число: {n}'
with open('game.txt', 'w') as inf:
  inf.write(s)