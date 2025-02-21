
def search_for_value_in_number(numbers_value, search)-> int:

	total = 0
	inputs = str (numbers_value)

	for nums in inputs:
		if search == nums:
			temp = int (search)
			total += 1
		
	return total

numbers = input('Enter numbers to search for: ')
searching = input('Which number would you search: ')

results = search_for_value_in_number(numbers, searching)

print(results)