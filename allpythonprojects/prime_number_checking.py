def get_prime_number(prime: int):

	for counter in range(1, number):
		if number % counter == 0:
			return True
	return False

input = 8
print(get_prime_number(input))