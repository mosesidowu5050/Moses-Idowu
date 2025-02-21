"""
3.1 (Validating User Input) Modify the script of Fig. 3.3 to validate its inputs. For any
input, if the value entered is other than 1 or 2, keep looping until the user enters a correct value. Use one counter to keep track of the number of passes, then calculate the number of failures after all the user’s inputs have been received.
"""

passes = 0
failures = 0

for student in range(10):
number = int(input('Enter number (1=pass, 2=fail): '))

if number == 1:
	passes = passes + 1
else:
	failures = failures + 1
print('Passes: ', passes)
print('Failures: ', failures)
