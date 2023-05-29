def alt_case(s):
    a = 1
    new = []
    for i in s:
        if i.isalpha():
            a += 1
            if a % 2 == 0:
                char = i.lower()
                new.append(char)
            else:
                char = i.upper()
                new.append(char)
        else:
            new.append(i)

    print(*new, sep='')


s = input()
alt_case(s)