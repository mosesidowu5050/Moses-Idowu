grade = 55;

if (grade >= 90):
	print('A')
elif (grade >= 80):
	print('B')
elif (grade >= 70):
	print('C')
elif (grade >= 60):
	print('D')
else:
	print('F')
	print('You have to take the course again')


product = 3
while product <= 50:
	product = product * 3
print(product)


product = 7

while (product <= 1000):
	product = product * 7
print(product)


for character in 'programming':
	print(character, end= ' ')


total = 0
for numbers in range(10000001):
	total = total + numbers
print(total, sep= ' ')
