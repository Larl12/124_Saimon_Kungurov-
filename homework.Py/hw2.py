import json
with open("data_file.json", "r") as read_file:
    data = json.load(read_file)
n = 0
m = 0
for i in range(4):
  for k in range(10):
    if data[i]['birthday'][k].isdigit():
      m += 1
    else:
      m = 0
    if m == 4:
      n += 2023 - int((data[i]['birthday'][k-3:k+1]))
print(n/4)