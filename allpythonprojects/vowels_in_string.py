def get_vowels_length(letter)-> int:

	vowels = str(letter)
	result = 0;
		
	for count in vowels:
		if count in ['a', 'e', 'i', 'o', 'u']:
			result = result +1

	return result


def get_duplicate_number(numbers: list)-> bool:

	digits = list(numbers)
	for number in range(len(digits)):
		for count in range(number+1, len(digits)):
			if digits[number] == digits[count]:
				
				return True
	return False


def get_anagram_string(lettersOne, lettersTwo: str)-> bool:

	#words = str(letters)
	for letters in lettersOne:
		if letters in lettersTwo:
			return True
		return False


def get_common_elements(number1, number2: list)->int:
	return [number for number in number1 if number in number2]


def get_factorial_of_five(number)-> int:

	value = str(number)
	result = 1;
		
	for count in range(number):
		result *= count
	
	return result

