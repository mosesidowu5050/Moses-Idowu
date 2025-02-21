import is_even_number

def check_if_is_even_number(values: list):
	my_list = []
	for nums in values:
		my_list.append(is_even_number(nums))

	return my_list

number = input('Enter numbers to check if its an even: ')
results = check_if_is_even_number(number)
print(results)