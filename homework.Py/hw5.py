from random import randint

s1 = []
s2 = []
for _ in range(randint(50, 100)):
  s1.append(randint(0, 9999))
for _ in range(randint(50, 100)):
  s2.append(randint(0, 9999))

for i in s1:
  if i in s2:
    print(i)
  else:
    continue