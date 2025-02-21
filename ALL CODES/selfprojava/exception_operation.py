"""
Exercise 1: Write a program which repeatedly reads numbers until the user enters
“done”. Once “done” is entered, print out the total, count, and average of the
numbers. If the user enters anything other than a number, detect their mistake
using try and except and print an error message and skip to the next number.
"""


#repeating numbers
#calculate total, count, average of numbers.

total = 0
count = 0
wrong_input = 0
average = 0

while True:
    try:
        numbers = input('Enter number to be calculated(enter "done" to end): ')
        count += 1
        total += int(numbers)
        average = total / count
            
    except ValueError as e:
        print('You can only enter value... ')
        wrong_input += 1
        
    finally:
        get = str(numbers)
        if get == "done":
            print('Saved >>>>>>>>>>>>>>>>>>')
            break
        
print('\nOperation Summary')
print('Total Is: ', total)
print('Average Is: ', average)
print('Total Count is:', count)
print('Wrong Input is:', wrong_input)
