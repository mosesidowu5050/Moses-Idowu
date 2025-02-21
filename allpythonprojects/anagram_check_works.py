def get_anagram_string(lettersOne, lettersTwo: str)-> bool:

	#words = str(letters)
	for letters in lettersOne:
		if letters in letterTwo:
			return True
		return False

letterOne = "listen"
letterTwo = "silent"
result = get_anagram_string(letterOne, letterTwo)
print(result)