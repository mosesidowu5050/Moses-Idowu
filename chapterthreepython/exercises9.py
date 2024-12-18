"""
3.9 (Separating the Digits in an Integer) In Exercise 2.11, you wrote a script that separated a five-digit integer into its individual digits and displayed them. Reimplement your script to use a loop that in each iteration “picks off” one digit (left to right) using the // and % operators, then displays that digit.

"""


for number in [12321]:
	extraction1 = number % 10 
	
extraction2 = number // 10

extraction3 = extraction2 % 10

extraction4 = extraction2 // 10

extraction5 = extraction4 % 10

extraction6 = extraction4 // 10

extraction7 = extraction6 % 10

extraction8 = extraction6 // 10

extraction9 = extraction8 % 10

print(extraction1, extraction3, extraction5, extraction7, extraction9)


