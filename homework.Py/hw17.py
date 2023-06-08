import csv
import datetime as d
import time

with open('test.csv', 'w') as inf:
  file_writer = csv.writer(inf, delimiter = ';', lineterminator='\r')
  names = ['№', 'Дата', 'Время', 'Секунды', 'Микросекунды']
  file_writer = csv.DictWriter(inf, delimiter = ";", lineterminator="\r", fieldnames=names)
  file_writer.writeheader()
  for i in range(1, 301):
    today = d.datetime.today()
    date = today.strftime('%m/%d/%Y')
    times = d.datetime.now().strftime('%H:%M')
    sec =  d.datetime.now().strftime('%S')
    mic =  d.datetime.now().strftime('%f')
    file_writer.writerow({'№': i, 'Дата': date, 'Время': times, 'Секунды': sec, 'Микросекунды': mic})
    time.sleep(0.01)