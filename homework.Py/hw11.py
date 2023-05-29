def eqv(a,b,c):
    if abs((a+b)-c)<eps:
        print(a+b)
        print(c)
        return True
    else:
        return False
a, b = float(input()), float(input())
c = a + b
eps = max(a, b) * 0.01
print(eqv(a, b, c))