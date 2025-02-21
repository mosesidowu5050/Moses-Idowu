def get_product_result(number: list)->int:

	values = list(number)
	total = 0
	multiply = 0

	for num1 in range(len(values)):
		for num2 in range(num1*num1, len(values)):
			multiply *= values[num1]
	return multiply

input = [1,2,3,4]
result = get_product_result(input)
print(result)