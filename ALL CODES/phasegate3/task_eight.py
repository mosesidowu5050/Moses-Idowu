import random

correct_score = 0
incorrect_score = 0

correct = True
incorrect = False

for roll in range(10):
	firstNumber = random.randrange(1, 100)
	secondNumber = random.randrange(1, 100)
	answer = firstNumber - secondNumber

	print('Solve The Problem ', firstNumber, '-', secondNumber)
	user_response = int(input())
	if user_response == answer:
		correct_score+= 1
	
	if user_response != answer:
		incorrect_score+= 1
	
print('Passed', correct_score, 'questions')
print('Failed', incorrect_score, 'questions')