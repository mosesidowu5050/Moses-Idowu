lists = [10, 15, 5, 20, 30, 46, 55]

def oddPosition(oddElement):

  count = 0

  for a in range(1, len(lists), 2):
   if (count < lists[a]):
    count = lists[a]
    print(count)

  return count

print(oddPosition(lists))