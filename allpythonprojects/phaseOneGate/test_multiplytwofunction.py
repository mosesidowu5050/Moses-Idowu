import unittest
import multiplytwofunction

class TestToCheckTwoRandomIntegers(unittest.TestCase):

	def test_to_multiply_two_numbers_works(self):
		multiplytwofunction.multiply_two_numbers(3, 3)

	def test_to_multiply_two_numbers_without_using_symbol(self):
		checking = multiplytwofunction.multiply_two_numbers(3, 3)
		total = 27
		self.assertEqual(checking, total)