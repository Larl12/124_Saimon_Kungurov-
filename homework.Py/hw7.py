def netflix(x, y, z, cost):
    if (x + y >= x + z) and (x + y >= y + z) and (x + y >= cost):
        print('Алиса и Боб')
    if (x + z >= x + y) and (x + z >= y + z) and (x + z >= cost):
        print('Алиса и Чарли')
    if (y + z >= x + y) and (y + z >= x + z) and (y + z >= cost):
        print('Боб и Чарли')
    if (y + z < cost) and (x + y < cost) and (x + z < cost):
        print('Никто не сможет')


x, y, z, cost = int(input()), int(input()), int(input()), int(input())
netflix(x, y, z, cost)