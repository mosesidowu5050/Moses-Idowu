x = int(input("Enter a number for x: "))
y = int(input("Enter a number for y: "))
z = int(input("Enter a number for z: "))


sum = x + y + z
average = (x * y * z) / 3
product = x * y * z

avrg = sum / 3

print('Sum is: ', sum)

print("Average is: " , avrg)

print("Product is: " , product)

if product > average:

	print("Product is the Largest: ", product)

if average < sum:

	print("Average is the Smallest: ", avrg)