print('Compound Interest Calculator')

initialIvestment = float(input('Enter your Initial Investment: '))

while initialIvestment <= 0:
	initialIvestment = float(input('Invalid... Enter your Initial Investment: '))
 

monthlyContribution = float(input('Enter your Monthly Contribution: '))

while monthlyContribution <= 0:
	monthlyContribution = float(input('Invalid... Enter your Monthly Contribution: '))

lengthInYears = int(input('Enter the Length of Years: '))

while lengthInYears <= 0:
	lengthInYears = int(input('Invalid... Enter the Length of Years: '))


estimatedInterest = float(input('Enter the Estimated Interest Rate: '))

while estimatedInterest <= 0:
	estimatedInterest = float(input('Invalid... Enter the Estimated Interest Rate: '))
rate = estimatedInterest / 100

print('Enter the Compound Frequency: ')
print(""" 
	1. Daily
	2. Monthly
	3. Annually """)

compoundFrequency = int(input('\nTime per year that the Interest will be Compounded?: '))

while compoundFrequency not in [1, 2, 3]:
	compoundFrequency = int(input('Invalid... Choose time the Interest will be Compounded?: '))


def getcompoundInterest(initialIvestment, monthlyContribution, lengthInYears,  rate, compoundFrequency):

 total = 0
 results = 0

 if compoundFrequency == 1:
  for daily in range(1, 366):
   total += initialIvestment * (1 + rate) ** daily + monthlyContribution

 if compoundFrequency == 2:
  for monthly in range(1, 13):
   total += initialIvestment * (1 + rate) ** monthly + monthlyContribution

 if compoundFrequency == 3:
  for annually in range(1, 2):
   total += initialIvestment * (1 + rate) ** annually + monthlyContribution

 return total

results = getcompoundInterest(initialIvestment, monthlyContribution, lengthInYears,  rate, compoundFrequency)

print('Compound Interest In', lengthInYears, 'years Is: ', results)


