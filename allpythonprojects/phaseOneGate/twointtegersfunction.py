def get_two_random_integers(firstNumber, secondNumber):

	for row in range(10):
		firstNumber = random.randrange(1, 100)
		secondNumber = random.randrange(1, 100)
		total = firstNumber + secondNumber
	
	print('Enter the sum of these numbers', firstNumber, '-', secondNumber, ': ')	
	user_answer = int(input())

	if user_answer == total:
	 return True if type(user_answer) == total else False

	