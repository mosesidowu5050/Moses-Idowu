goods = []
quantity = []
price = []

looping = True
total = 0
subTotal = 0
vatrate = 17.50

customerName = input('\nWhat is the customer name?: ')

while (looping):
 allgoods = input('What did the user buy?: ')
 goods.append(allgoods)

 allquantity = int(input('What is the quantity?: '))

 while allquantity <= 0:
	 allquantity = int(input('Invalid input... What is the quantity?: '))
 quantity.append(allquantity)


 allprice = float(input('How much per unit?: '))
 
 while allprice <= 0:
 	 allprice = float(input('Invalid... How much per unit?: '))
 price.append(allprice)
 print('\n' + allgoods + " added successfully ")

 userChoice = input('\nAdd more items? (yes/no): ')
 
 while userChoice not in ["yes", "no", "YES", "NO", "Yes", "No"]:
 	userChoice = input('Invalid.. select (yes/no): ')

 if userChoice == "yes" and "YES" and "Yes":
  continue

 if userChoice == "no" and "NO" and "No":
   break

cashierName = input('Cashier Name: ')

discountRate = float(input('How much discount will he/she get: '))

while discountRate <= 0:
	discountRate = float(input('Invalid... How much discount will he/she get: '))


print("\nSEMICOLON STORES")
print("MAIN BRANCH")
print("LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS")
print("TEL: 03293020343")
print("DATE: 4 - JAN - 25, 10:45:12 PM ")
print("CASHIER NAME: " + cashierName)
print("CUSTOMER NAME: " + customerName)

print("==========================================================================")
print("\t\t", "ITEM", "\t\t", "QTY", "\t\t", "PRICE", "\t\t", "TOTAL(NGN)")

for items in range(len(goods)):
 total = price[items] * quantity[items]
 subTotal += price[items] * quantity[items]
 print(f'\t\t{goods[items]}\t\t{price[items]}\t\t{quantity[items]}\t\t{total}')
print("-------------------------------------------------------------------------- ")

rate = discountRate / 100 * subTotal
vat = vatrate / 100 * subTotal

print("\t\t\t\t", 'Sub Total: ', "\t", subTotal) 
print("\t\t\t\t", 'Discount: ', "\t", rate)
print("\t\t\t\t", 'VAT @17.50%: ', "\t", vat)
print("\n==========================================================================")

billTotal = subTotal + vat - rate

print("\t\t\t\t ", "Bill Total: ", "\t", billTotal);
print("\n==========================================================================")
print("\t\t", "THIS IS NOT AN RECEIPT KINDLY PAY ",  billTotal)
print("\n==========================================================================\n")

userPayment = float (input("How much did the customer pay?: "))

while userPayment <= 0:
	userPayment = float (input("Error, enter the customer payment?: "))

while userPayment < billTotal:
	userPayment = float (input("Error, the customer payment is not up to the Total Bill?: "))

balance = userPayment - billTotal; 


print("\nSEMICOLON STORES")
print("MAIN BRANCH")
print("LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS")
print("TEL: 03293020343")
print("DATE: 4 - JAN - 25, 10:45:12 PM ")
print("CASHIER NAME: " + cashierName)
print("CUSTOMER NAME: " + customerName)

print("==========================================================================")
print("\t\t", "ITEM", "\t\t", "QTY", "\t\t", "PRICE", "\t\t", "TOTAL(NGN)")

for items in range(len(goods)):
 total = price[items] * quantity[items]
 subTotal += price[items] * quantity[items]
 print(f'\t\t{goods[items]}\t\t{price[items]}\t\t{quantity[items]}\t\t{total}')
print("-------------------------------------------------------------------------- ")

print("\t\t\t\t", 'Sub Total: ', "\t", subTotal) 
print("\t\t\t\t", 'Discount: ', "\t", rate)
print("\t\t\t\t", 'VAT @17.50%: ', "\t", vat)
print("\n==========================================================================")
       
print("\t\t\t\t", 'Bill Total: ', "\t", billTotal)
print("\t\t\t\t", 'Amount Paid: ', "\t", userPayment)
print("\t\t\t\t", 'Balance: ', "\t", balance)
print("\n==========================================================================")
print("\t\t", "THANKS FOR YOUR PATRONAGE")
print("\n==========================================================================")

input()