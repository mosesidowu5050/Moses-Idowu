import unittest
import sumnumbersfunctions

class TestOfDifferentCases(unittest.TestCase):
	sumnumbersfunctions.sum_numbers('12345')

	def test_to_check_even_numbers(self):
		actual = sumnumbersfunctions.sum_numbers('12345')
		results = 15
		self.assertEqual(actual, results)


class TestOfSearchingNumbers(unittest.TestCase):
	sumnumbersfunctions.search_for_value_in_number('125ty', 5)
	
	def test_for_number_searching_in_strings(self):
		actual = sumnumbersfunctions.search_for_value_in_number('122uy', 1)
		results = 1
		self.assertEqual(actual, results)