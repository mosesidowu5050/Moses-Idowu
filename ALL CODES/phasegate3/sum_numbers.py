def sum_numbers(values)-> int:

	summing = 0
	
	for add in values:
		summing+= int(add)
		

	return summing

numbers = input('Enter numbers to be sum: ')
result = sum_numbers(numbers)

print(result)