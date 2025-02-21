import unittest
import largest_number

class TestForTheLargestNumber(unittest.TestCase):

	def test_to_check_the_largest_number_exist(self):
		numbers = [1, 50, 75, 90, 22, 12, 20]
		largest_number.get_the_largest_number(numbers)

	def test_to_check_the_largest_number(self):
		numbers = [1, 50, 75, 90, 22, 12, 20, 121, 345]
		actual = largest_number.get_the_largest_number(numbers)
		result = [75, 90, 121, 345]
		self.assertEqual(actual, result)


if__name__="__main__"
unittest.main()
