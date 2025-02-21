import re

age = input('enter your age: ')
if re.match("^[0 - 9]+$", age):
	print('Data saved successfully>>>>>>>')
else:
	print('Invalid input. please enter your age: ')
	age = input('enter your age: ')





#result = re.sub("[a-zA-Z]", ' ', number)
#print('Data saved successfully>>>>>>>')


