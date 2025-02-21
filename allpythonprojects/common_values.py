def get_common_elements(number1, number2: list)->int:
	return [number for number in number1 if number in number2]
	
	
input = [1,2,3]
input2 = [3,4,5]
result =  get_common_elements(input, input2)
print(result)
	