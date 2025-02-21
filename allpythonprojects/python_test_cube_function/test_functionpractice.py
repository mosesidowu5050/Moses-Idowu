import unittest
import functionpractice

class TestCubeFunction(unittest.TestCase):

	def test_that_cube_function_exists(self):
		functionpractice.get_cube(3)

	def test_that_cube_function_return_correct_value(self):
		actual = functionpractice.get_cube(3)
		result = 27
		self.assertEqual(actual, result)

		actual = functionpractice.get_cube(5)
		result = 125
		self.assertEqual(actual, result)

	def test_that_cube_function_return_negative_value_with_negative_parameter(self):
		actual = functionpractice.get_cube(-3)
		result = -27
		self.assertEqual(actual, result)

	def test_that_cube_function_return_invalid_data_with_invalid_input(self):
		actual = functionpractice.get_cube('a')
		result = 'Valid Data'
		self.assertEqual(actual, result)

	def test_that_cube_function_return_correct_value_with_decimal_value(self):
		actual = functionpractice.get_cube(3.25)
		result = 34.328
		self.assertEqual(actual, result)

class TestFunctionDollar(unittest.TestCase):

	def test_get_exchange_rate_function_exist(self):
		functionpractice.get_exchange_rate(2)

	def test_amount_of_exchange_rate_in_dollar(self):
		actual = functionpractice.get_exchange_rate(2)
		result = 3100
		self.assertEqual(actual, result)


