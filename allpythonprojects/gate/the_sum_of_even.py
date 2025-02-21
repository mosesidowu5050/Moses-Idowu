def get_the_sum_of_even(number: list):
	
	total = 0
	for values in number:
		if values % 2 == 0:
			total += values
	return total
"""
return sum([values for values in numbers if numbers % 2 == 0)]
"""