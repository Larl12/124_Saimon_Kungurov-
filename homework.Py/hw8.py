def  search_substr(subst, st):
  if subst in st:
    print('Есть контакт!')
  else:
    print('Мимо!')

subst, st = input(), input()
search_substr(subst, st)