deposit_account = []
withdrawals_account = []
account_balance = []

print('\nWelcome, to OBLEE Bank Plc.')
userName = input('Enter your username?: ')
print('Welcome,', userName)

print("""
	1. Deposit
	2. Withdrawal
	3. Account Balance
	4. Menu
""")

loop_continue = True
total_deposit = 0
money = 0

user_choice = int(input('choose your preffered option: '))

while user_choice not in [1, 2, 3, 4]:
	user_choice = int(input("Invalid selection... select (1-4): "))


while loop_continue:
 if user_choice == 1:
  deposit = float(input('How much would you like to deposit?:$ '))
  print('$', deposit, 'transaction successful')
  deposit_account.deposit
 
  user_option = input('Press (yes) for another Deposit. Press (no) for menu: ')

 while user_option not in ["yes", "YES", "Yes", "no", "NO", "no"]:
   user_option = input('Invalid Selection.... \nPress (Yes) for Deposit. Press (No) for menu: ')
 
 if user_option == "yes" and "YES" and "Yes":
   continue
  
 if user_option == "no" and "NO" and "No":
  for money in range(len(deposit_account)):
   print(f'\nAccount Balance: {deposit_account[money]}')

   print("""
   choose your preffered option (1 - 4):
   1. Deposit
   2. Withdrawal
   3. Account Balance
   4. Menu
       """)
   break

 if user_choice == 2:
  withdrawal = input('How much do you wants to withdraw?:$ ')
  print(withdrawal, 'transaction successful')
  withdrawals_account.append(withdrawal)

   #choice = input('Choose your preffered option: ')
   #elif choice == 0:
    #break

