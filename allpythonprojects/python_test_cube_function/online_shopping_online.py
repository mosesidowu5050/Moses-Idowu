class OnlineShoppingStore:

  products_names= []
  products_price = []
  products_id = []

  shopping_cart= []
  order_class = []

customer_name = str(input('Enter your name: '))
customer_id = str(input('Enter your ID: '))

print('Welcome, ' + customer_name + ', ID:' + customer_id + ' to our shopping store...'/ )b

print("""
	1. All Products Available
	2. Shopping Carts
	3. Place Orders

What will you like to order today (1 - 3)?...
""")
user_option = int(input())

while user_option not in [1, 2, 3]:
	user_option = int(input('Invalid Input.... options (1 - 3): '))

match user_option:
  case 1:
    print("""
    1. Oraimo WristWatch 
    2. itel WristWatch 
    3. Tecno S30
    4. iPhone 13pro max
    5. Rechargeable lamps
    6. Dell Latitude corei5
    7. Samsung Notepad S9
    """)

  case 2:
    print("""
    1. Oraimo WristWatch 
    2. itel WristWatch
    """)