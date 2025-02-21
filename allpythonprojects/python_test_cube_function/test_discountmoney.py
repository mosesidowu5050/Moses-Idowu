import unittest
import discountmoney


class GettingCorrectDiscount(unittest.TestCase):

	def test_that_get_discount_value_exists(self):
		discountmoney.get_discount_value(10)

	def check_correct_discount_value(self):
		actual = discountmoney.get_discount_value('a')
		result = 5.5
		self.assertEqual(actual, result)