print('WELCOME TO IYA MOSES PIZZA JOINT AJEGUNLE')
print('What would you like to order from us ?...')
print(""" 
    PIZZA TYPE      NUMBER OF SLICES        PRICE PER BOX
1.  Sapa size           4                       2,500
2.  Small Money         6                       2,900
3.  Big Boys            8                       4,000
4.  Odogwu              12                      5,200
0.  Exit... 

""")

print('Kindly, select your pizza type from the menu (1 - 4)')
pizzatype = int(input())

print('Okay. How many guest would you like to order for ?')
noOfGuest = int(input())

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

    print('\nPress 0 to make your order and exit..')
    customerChoice = int(input())
    if customerChoice == 0:
     print('Order in progress... Thanks for your patronage!')
    elif customerChoice != 0:
     print('Error... Press 0 to exit..')

if pizzatype == 2:
    print('Number of boxes of pizza to buy = ', noSmallBox, ' boxes... ', 'Sapa size contains ', noOfSmallSlices, ' slices ')
    print('Number left over slices after serving = ', leftoverSmall)
    print('Price = ', smallmoneyPay)

    print('\nPress 0 to make your order and exit..')
    customerChoice = int(input())
    if customerChoice == 0:
     print('Order in progress... Thanks for your patronage!')
    elif customerChoice != 0:
     print('Error... Press 0 to exit..')

if pizzatype == 3:
    print('Number of boxes of pizza to buy = ', noBigBox, ' boxes... ', 'Sapa size contains ', noOfBigSlices, ' slices ')
    print('Number left over slices after serving = ', leftoverBig)
    print('Price = ', bigboysPay)

    print('\nPress 0 to make your order and exit..')
    customerChoice = int(input())
    if customerChoice == 0:
     print('Order in progress... Thanks for your patronage!')
    elif customerChoice != 0:
     print('Error... Press 0 to exit..')

if pizzatype == 4:
    print('Number of boxes of pizza to buy = ', noOdogwu, ' boxes... ', 'Sapa size contains ', noOfOdogwuSlices, ' slices ')
    print('Number left over slices after serving = ', leftoverOdogwu)
    print('Price = ', odogwuPay)

    print('\nPress 0 to make your order and exit..')
    customerChoice = int(input())
    if customerChoice == 0:
     print('Order in progress... Thanks for your patronage!')
    elif customerChoice != 0:
     print('Error... Press 0 to exit..')
