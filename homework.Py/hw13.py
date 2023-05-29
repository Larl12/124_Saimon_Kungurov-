s = input().split()
c=0
a=''
for i in range(len(s)):
    if s.count(s[i])>c:
        c = s.count(s[i])
        a = s[i]
print(a, c)
print(max(s, key=len))