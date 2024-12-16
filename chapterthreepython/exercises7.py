"""
3.8 (Arithmetic, Smallest and Largest) In Exercise 2.10, you wrote a script that input
three integers, then displayed the sum, average, product, smallest and largest of those values. Reimplement your script with a loop that inputs four integers

"""

sum = 0
average = 0
largest = 0
product = 0

for number in range(3, 7):
	print(number, end= ' ')


for number in [3, 4, 5, 6]:
	sum += number
	average = sum / 4
	largest = number
	product = 3 * 4 * 5 * 6

print('Sum Is: ', sum)
print('Average Is: ', average)
print('Largest Is: ', largest)
print('Product Is: ', product)


