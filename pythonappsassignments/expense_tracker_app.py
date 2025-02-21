import datetime

date = []
description = []
amount = []

total = 0

print("""

Welcome to Semicolon Expense Tracker App'
=============================================
1. Add an expenses
2. View all expenses
3. Calculate total expenses
4. Exit

""")

while True:

 try:
   menu_options = int(input("Enter your choice between (1-4): "))
 
   if menu_options not in [1, 2, 3, 4]:
         menu_options = int(input("Invalid, input your choice between (1-4): "))
         continue

   if menu_options == 1:
       while True:
         date_input = input("Kindly, enter today's date (YYYY-MM-DD): ")
         
         try:
            valid_date = datetime.datetime.strptime(date_input, "%Y-%m-%d").date()
            date.append(str(valid_date))
            break

         except ValueError:
            print("Invalid format! Please enter the date in YYYY-MM-DD format.")
            continue

       while True:
        description_input = input("Kindly, enter the description: ")

        if description_input:
            description.append(str(description_input))
            break
        else:
            print("Invalid... enter the valid description.")
            continue

       while True:
         amount_input = input("Kindly, enter the amount: ")
         try: 
            amount_input = float(amount_input)
            if amount_input <= 0:
              print("Amount should be greater than zero. enter a valid amount: ")
            else:  
              amount.append(amount_input)
              break
        
         except ValueError:
            print("Invalid... enter correct amount")
            continue

       print('Expense added.....')


   elif menu_options == 2:
        if not date:
            print("There is no expenses recorded.")
        else:
            print("\nExpenses: ")
            for all_expenses in range(len(date)):
               print(f'{all_expenses+1}. Date: {date[all_expenses]}, Description: {description[all_expenses]}, {amount[all_expenses]}')
               continue


   elif menu_options == 3:
        if not amount:
            print("There is no expenses recorded.")
        else:
            total_expenses = sum(amount)
            print(f'\n Total Expenses: #{total_expenses}')
 
   elif menu_options == 4:
       print(f'Thanks for using Semicolon Expense Tracker App')
       break;

 except ValueError:
     print()

    


