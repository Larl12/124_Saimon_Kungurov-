from random import randint

def eqv(s, d):
  summ = 0
  for i in range(len(s)):
    if s[i] == d[i]:
      summ += 1
  print(f'Количество моментов времени, когда рынок находился в равновесии: {summ}')


n = int(input())
s = [randint(100, 999) for _ in range(n)]
d = [randint(100, 999) for _ in range(n)]
eqv(s, d)