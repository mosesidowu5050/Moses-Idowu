print('WELCOME TO IYA MOSES PIZZA JOINT AJEGUNLE')
print('What would you like to order from us ?...')
print(""" 
    PIZZA TYPE      NUMBER OF SLICES        PRICE PER BOX
1.  Sapa size           4                       2,500
2.  Small Money         6                       2,900
3.  Big Boys            8                       4,000
4.  Odogwu              12                      5,200

""") 

pizzatype = int(input('Kindly, select your pizza type from the menu (1 - 4): '))

while pizzatype not in [1, 2, 3, 4]:
 	pizzatype = int(input('Kindly, select your pizza type from the menu (1 - 4) :'))


noOfGuest = int(input('Okay. How many guest would you like to order for ?: '))

while noOfGuest <= 0:
	noOfGuest = int(input('Invalid selection of guest... Enter how many guest?: '))


noOfSapaSlices = 4 
noOfSmallSlices = 6
noOfBigSlices = 8 
noOfOdogwuSlices = 12

noSapaBox = 0 
noSmallBox = 0
noBigBox = 0
noOdogwu = 0

noSapaBox = noOfGuest // noOfSapaSlices
noSmallBox = noOfGuest // noOfSmallSlices
noBigBox = noOfGuest // noOfBigSlices
noOdogwu = noOfGuest // noOfOdogwuSlices

if noOfGuest % 4 != 0:
    noSapaBox = noSapaBox + 1
if noOfGuest % 6 != 0:
    noSmallBox = noSmallBox + 1
if noOfGuest % 8 != 0:
    noBigBox = noBigBox + 1
if noOfGuest % 12 != 0:
    noOdogwu = noOdogwu + 1

leftover1 = noSapaBox * noOfSapaSlices
leftoverSapa = leftover1 - noOfGuest 

leftover2 = noSmallBox * noOfSmallSlices
leftoverSmall = leftover2 - noOfGuest 

leftover3 = noBigBox * noOfBigSlices
leftoverBig = leftover3 - noOfGuest 

leftover4 = noOdogwu * noOfOdogwuSlices
leftoverOdogwu = leftover4 - noOfGuest 

sapaprice = 2500
smallmoney = 2900
bigboys = 4000
odogwu = 5200

sapaPay = sapaprice * noSapaBox
smallmoneyPay = noSmallBox * smallmoney
bigboysPay = noSmallBox * bigboys
odogwuPay = noOdogwu * odogwu

if pizzatype == 1:
    print('Number of boxes of pizza to buy = ', noSapaBox, ' boxes... ', 'Sapa size contains ', noOfSapaSlices, ' slices ')
    print('Number left over slices after serving = ', leftoverSapa)
    print('Price = ', sapaPay)

  
if pizzatype == 2:
    print('Number of boxes of pizza to buy = ', noSmallBox, ' boxes... ', 'Sapa size contains ', noOfSmallSlices, ' slices ')
    print('Number left over slices after serving = ', leftoverSmall)
    print('Price = ', smallmoneyPay)

if pizzatype == 3:
    print('Number of boxes of pizza to buy = ', noBigBox, ' boxes... ', 'Sapa size contains ', noOfBigSlices, ' slices ')
    print('Number left over slices after serving = ', leftoverBig)
    print('Price = ', bigboysPay)

if pizzatype == 4:
    print('Number of boxes of pizza to buy = ', noOdogwu, ' boxes... ', 'Sapa size contains ', noOfOdogwuSlices, ' slices ')
    print('Number left over slices after serving = ', leftoverOdogwu)
    print('Price = ', odogwuPay)

  