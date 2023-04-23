import math

m2 = float(input('Введите массу второй планеты'))
x = int(input('Введите степень'))
x = math.pow(10, x) * m2
R = float(input('Введите расстояние планеты'))
G = 6.6743 * 10**-11
m1 = 5.97600 * 10**24
F = G * (m1 * m2) / R**2
print(F)
