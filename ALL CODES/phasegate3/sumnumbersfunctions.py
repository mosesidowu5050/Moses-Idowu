def sum_numbers(values: str)-> str:

	summing = 0
	
	for add in values:
		summing+= int(add)
		

	return summing

def search_for_value_in_number(numbers_value, search)-> int:

	total = 0
	inputs = str (numbers_value)

	for nums in inputs:
		if search == nums:
			temp = int(search)
			total += 1
		
	return total
