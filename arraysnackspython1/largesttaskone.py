lists = [262, 450, 3545, 631, 137, 671, 1350]

def largestElement(larger):
  largest = 0
  for c in range(len(lists)):

    if (lists[c] > largest):
     largest = lists[c]

  return largest

def smallestElement(smaller):
  smallest = lists[0]

  for a in range(len(lists)):
   if (lists[a] < smallest):
    smallest = lists[a]

  return smallest;

def totalElement(totalling):
  total = 0

  for b in range(len(lists)):
   total += lists[b]

  return total
  

print('Largest Is: ', largestElement(lists))
print('Smallest Is: ', smallestElement(lists))
print('Total Is: ', totalElement(lists))