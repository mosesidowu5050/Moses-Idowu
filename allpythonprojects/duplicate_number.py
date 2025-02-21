def get_duplicate_number(numbers: list)-> bool:

	digits = list(numbers)
	for number in range(len(digits)):
		for count in range(number+1, len(digits)):
			if digits[number] == digits[count]:
				
				return True
	return False

number = [1, 7, 3, 4, 2]
result = get_duplicate_number(number)
print(result)

def get_duplicated_nums(numbers: list)-> int:

  for i in numbers:
    for j in numbers:
      if numbers[i] in numbers[j]:
        return True
      return False


digit = [5, 1, 5, 7, 2]
result = get_duplicate_number(digit)
print(result)


def get_common_lists(elementOne: list, elementTwo: list)-> int:

  return[i for i in elementOne if i in elementTwo]



  common = [ ]
  elementOne = []
  elementTwo = [ ]

  for i in range(len(elementOne)):
    for j in range(len(elementTwo)):
      if elementOne[i] in elementTwo[j]:
        common.append(elementOne[i])
      return elementOne[i]
  
digit = [8, 4, 6, 9]
digit2 = [7, 8, 1, 9]
result = get_common_lists(digit, digit2)
print(result)


def product_all_numbers(nums: list)-> int:

  return sum([i for i in nums if i ** 2])
  products = [ ]
  summing = 0

  

numw = [1, 2, 3, 4]
result = product_all_numbers(numw)
print(result)
