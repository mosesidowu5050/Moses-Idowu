def get_vowels_length(letter)-> int:

	vowels = str(letter)
	result = 0;
		
	for count in vowels:
		if count in ['a', 'e', 'i', 'o', 'u']:
			result = result +1

	return result

letters = "python is sweet"
results = get_vowels_length(letters)
print(results)