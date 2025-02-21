list = []

def even_number_testing(strings_of_values: str)-> int:

	total = 0

	for numbers in strings_of_values:
		if numbers.isnumeric():
			stores = int (numbers)
	
			if stores % 2 == 0:
				total += stores

	return total

sum_even= str(input('Getting the sum of even numbers in a string: '))
answer = even_number_testing(sum_even)

print('The Sums Is: ', answer)

