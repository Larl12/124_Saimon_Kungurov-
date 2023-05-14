from random import randint


def magic(n):
    x = int(input())
    s = sum(n)
    if s % x == 0:
        return True
    else:
        return False


n = [randint(0, 9999) for _ in range(randint(5, 100))]
print(magic(n))