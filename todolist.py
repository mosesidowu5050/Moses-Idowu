def menu(menu: str):

   all_menu = "TO DO LIST"
   return menu


def add_a_task(task: str):

    if task:
       return 'Task added'
    else:
       return 'Invalid'


def view_all_tasks(all_task: list):

    for view_tasks in range (len(all_task)):
        return f'{all_task[view_tasks]}'


def mark_task_complete(task_complete: list):

    for mark_tasks in range (len(task_complete)):
        return f'{mark_task[task_complete]}'

def main():

     adding_task = []
     viewing_task = []
     marking_task = []
     delete_task = []
     counter = 0

     print ("""
1. Add a task
2. View all tasks
3. Mark a task as complete
4. Delete a task
5. Exit
""")

     while True:
        try:  
           input_option = int(input("Enter your choice from (1-5): "))
           if input_option not in [1, 2, 3, 4, 5]:
             print("Please let your input be between 1 to 5")

        except ValueError:
             print("Please only input an Integer")

        if input_option == 1:
            counter += 1
            while True:
              task_added = input("\nYou can enter your task: ")
              if add_a_task(task_added):
                 adding_task.append(task_added)
                 break
              else:
                 print("Invalid input")
            print("Task added!!!")


        elif input_option == 2:
             counter += 2
             while True:
                for all_task_view in range (len(adding_task)):
                   print(f'{all_task_view + 1}.[]{adding_task[all_task_view]}')
                break

        elif input_option == 3:
         
        elif input_option == 5:
             input_option == 5
             print("Goodbye")
             break


#if __name__ == "__main__":
main()