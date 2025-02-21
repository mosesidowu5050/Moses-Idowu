print('\nBack To Sender Logistics Services Payment Machine')
riderPay = 0

def ridersWages (riderPay):

  successDelivery = int(input('\nEnter amount of successful delivery: '))
  print(successDelivery,'successful delivery')

  amountParcel1 = 160 
  amountParcel2 = 200 
  amountParcel3 = 250
  amountParcel4 = 500 
  basePay = 5000 
  total = 0
 
  if successDelivery < 50:
   total = (successDelivery * amountParcel1) + basePay
  if successDelivery <= 59:
   total = (successDelivery * amountParcel2) + basePay
  elif successDelivery <= 69:
   total = (successDelivery * amountParcel3) + basePay
  elif successDelivery >= 70:
   total = (successDelivery * amountParcel4) + basePay 

  return total
 
print('Rider Wages for the day is: ', ridersWages(riderPay))
