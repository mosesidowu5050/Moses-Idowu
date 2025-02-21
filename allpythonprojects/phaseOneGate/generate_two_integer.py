import random

for numbers in range (2):
    firstNumber = random.randrange(1, 100)
    secondNumber = random.randrange(1, 100)
    sum = firstNumber + secondNumber

print('Enter the sum of these numbers', firstNumber, '+', secondNumber, ': ' )
user_answer = int(input())

if user_answer == sum:

  print(True) 

else: 

  print(False)