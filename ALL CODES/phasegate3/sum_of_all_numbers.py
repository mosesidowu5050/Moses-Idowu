def sum_of_all_numbers(values)-> int:

	summing = 0
	nums = str(values)

	for add in nums:
		if add.isnumeric():
			temp = int(add)
			summing += temp


	return summing

numbers = input('Enter numbers to be sum: ')
result = sum_of_all_numbers(numbers)

print(result)