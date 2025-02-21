
failure = 0
passes = 0

for student in range(5):
	result = int(input('Enter result (1=pass, 2=fail): '))

if result == 1:
	passes = passes + 1
else:
	failure += result 
print('Passes is: ', passes)
print('Failure is: ', failure)






"""
num1 = 7
num2 = 5
product = 7*5

print(f'7 times 5 is product}')

x = 10
y = 2
product = 10*2

print(f'10 times 2 is {product}')

"""


"""
total = 0
average = 0

for number in (98, 76, 71, 87, 83, 90, 57, 79, 82, 94):
	total += number
	average = total / 10

print(total)

print("The average is: ", average)

count = 1
total = 0
average = 0
largest = 0


for number in range(1, 11):
	print(number)
	
while count < number:
	print(count)
	count += 1	
	total += number 
	average = total + count / 19
	if number > largest & count < largest:
		largest = number & count

print("Largest is: ", largest)
print("Total is: ", total)
print("Average is: ", average)
"""

	