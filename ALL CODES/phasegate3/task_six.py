print('0 >> Sunday \n1 >> Monday \n2 >> Tuesday \n3 >> Wednesday \n4 >> Thursday \n5 >> Friday \n6 >> Saturday')

days = int(input('\nEnter a number for today day of the week: '))
while days < 0 or days > 6:
	days = int(input('Invalid... Enter correct number for today day of the week: '))


future = int(input('\nEnter number of days after today for a future day: '))
while days < 0 or days > 6:
	future = int(input('Invalid... Enter number of days after today for a future day: '))


match days:
	case 0: print('Today is Sunday 