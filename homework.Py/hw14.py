a, b = int(input()), int(input())
summ = 0
if b < a:
  for i in range(b, a + 1):
    summ += i
  print(summ)
else:
  for i in range(a, b + 1):
    summ += i
  print(summ)