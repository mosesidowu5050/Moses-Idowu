def is_even_and_odd(list)->list:

	my_list = []

	for nums in list:
		if nums % 2 == 0:
			my_list.append(nums)

		
	return 

	


even = input('Enter lists number: ')
results = is_even_and_odd(even)

print(results)