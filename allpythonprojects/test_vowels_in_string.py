import unittest
import vowels_in_string

class TestVowelsInString(unittest.TestCase):
	
	def test_if_vowels_in_string_exist(self):
		vowels_in_string.get_vowels_length('python is sweet')

	def test_to_count_total_vowels_in_string(self):
		letters = "python is sweet"
		actual = vowels_in_string.get_vowels_length(letters)
		result = 4
		self.assertEqual(actual, result)

	def test_to_find_dulicates_numbers(self):
		numbers = [1, 2, 3, 4, 5, 2]
		actual = vowels_in_string.get_duplicate_number(numbers)
		result = True
		self.assertEqual(actual, result)

	def test_the_anagram_true_or_false(self):
		letterOne = "listen"
		letterTwo = "silent"
		actual = vowels_in_string.get_anagram_string(letterOne, letterTwo)
		result = True
		self.assertEqual(actual, result)

	def test_to_find_common_elements_in_the_list(self):
		numbers = [1, 2, 3]
		numberOne = [3, 4, 5]
		actual = vowels_in_string.get_common_elements(numbers, numberOne)
		result = [3]
		self.assertEqual(actual, result)



if__name__="__main__"
unittest.main()