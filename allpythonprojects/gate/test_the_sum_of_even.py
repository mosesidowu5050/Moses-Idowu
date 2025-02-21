import unittest
import the_sum_of_even

class TestTheEvenNumber(unittest.TestCase):

	def test_if_the_sum_of_even_number_works(self):
		numbers = [2,7,5,11,1, 90]
		the_sum_of_even.get_the_sum_of_even(numbers)
	
	def test_that_even_sum_return_correct_value(self):
		numbers = [2,7,5,11,17, 19,2,8,10]
		result = the_sum_of_even.get_the_sum_of_even(numbers)
		expected = 22
		self.assertEqual(result, expected)

if__name__="main__"
unittest.main()
