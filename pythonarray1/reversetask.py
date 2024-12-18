lists = [10, 15, 5, 20, 30, 46, 55]

def reverseFunction(reverseLists):

  reverseLists.sort(reverse=True)

  return reverseLists

print('Reverse Lists: ', reverseFunction(lists))