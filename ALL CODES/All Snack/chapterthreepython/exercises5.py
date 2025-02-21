"""

3.5 (if…else Statements) Reimplement the script of Fig. 2.1 using three if…else
statements rather than six if statements. [Hint: For example, think of == and != as “opposite”
tests.]

"""


score1 = int(input('Enter First Score: '))
score2 = int(input('Enter Second Score: '))

if score1 == score2:
	print('Score 1 is equals to Score 2')
else: score1 != score2
print('Score 1 is not equals to Score 2')


if score1 > score2:
	print('Score 1 is greater than Score 2')
else: score1 < score2
print('Score 1 is less than Score 2')


if score1 >= score2:
	print('Score 1 is greater than or equals to Score 2')
else: score1 <= score2
print('Score 1 is less than or equals to Score 2')