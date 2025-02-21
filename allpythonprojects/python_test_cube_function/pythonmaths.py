lists = [2, 6, 44, 6, 23, 80, 5, 12]
largest = lists[0]
smallest = lists [0]
even = 0

for count in range(len(lists)):
	if lists[count] > largest:
		largest = lists[count]
print(f'The largest is: {largest}')

for count in range(len(lists)):
	if lists[count] % 2 == 0:
		even+1(lists[count])

print(f'The even numbers are: {even}')


