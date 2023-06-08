import os

def print_docs(path):
  for dirs,folder,files in os.walk(path):
    print('Выбранный каталог: ', dirs)
    print('Вложенные папки: ', folder)
    print('Файлы в папке: ', files)

path = input()
print(print_docs(path))