"""
3.12 (Palindromes) A palindrome is a number, word or text phrase that reads the same
backwards or forwards. For example, each of the following five-digit integers is a palindrome: 12321, 55555, 45554 and 11611. Write a script that reads in a five-digit integer and determines whether it’s a palindrome. [Hint: Use the // and % operators to separate the number into its digits.]

"""


for number in [55555]:
	extraction1 = number % 10 
	
extraction2 = number // 10

extraction3 = extraction2 % 10

extraction4 = extraction2 // 10

extraction5 = extraction4 % 10

extraction6 = extraction4 // 10

extraction7 = extraction6 % 10

extraction8 = extraction6 // 10

extraction9 = extraction8 % 10

if extraction1 == extraction9:
	print('55555 Is A Palindrome')

