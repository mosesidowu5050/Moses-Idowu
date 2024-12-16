"""
3.10 (7% Investment Return) Reimplement Exercise 2.12 to use a loop that calculates
and displays the amount of money you’ll have each year at the ends of years 1 through 30.


7% = 7/100 = 0.07 x 5,000,000 = 350,000 a year x 30yrs = 10,500,000

"""

money = 5000000
percentage = 7
years30 = 30


for years in range(30):
	each_year = percentage / 100 * money
	years = percentage / 100 * years30 * money


rounded_number = round(each_year, 2)
print('Money At The End Of 1 Year', rounded_number)


rounded_number = round(years, 2)
print('Money At The End Of 30 Years', rounded_number)


