lists = [712, 38, 538, 230, 134, 125, 85]

def totalOfLists(totaling):
  total = 0

  for c in range(len(lists)):
   total += lists[c]

  return total

print('Total Is: ', totalOfLists(lists))