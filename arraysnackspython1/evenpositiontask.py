lists = [10, 15, 5, 20, 30, 46, 55]

def evenPosition(evenNumber):

  count = 0

  for a in range(2, len(lists), 2):
   if (count < lists[a]):
    count = lists[a]
    print(count)
  
  return count

print('Even Positions: ', evenPosition(lists));