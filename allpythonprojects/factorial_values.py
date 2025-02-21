def get_factorial_result(number: int)->int:

	values = str(number)
	total = 0

	for num in range(5):
		total *= num
	return total

input = 5
result = get_factorial_result(input)
print(result)