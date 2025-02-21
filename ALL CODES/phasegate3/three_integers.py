lists = []

for numbers in range(3):
	three_numbers = input('Enter three integers: ')
	lists.append(three_numbers)
	ascending_numbers = sorted(lists)

print(ascending_numbers)

