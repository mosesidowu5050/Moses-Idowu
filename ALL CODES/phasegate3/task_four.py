user_input = int(input('Enter a number (0 - 1000): '))
extraction_modulo = user_input // 10

while user_input < 0 or user_input > 1000:
	user_input = int(input('Ivalid number... Enter a number (0 - 1000): '))

extraction_one = extraction_modulo % 10
extraction_two = extraction_modulo // 10
extraction_three = extraction_two % 10
extraction_four = extraction_three // 10

result = extraction_one + extraction_three + extraction_four

print('Sum Of Its Digits Is: ', result)