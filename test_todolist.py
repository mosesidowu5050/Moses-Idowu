import unittest
import todolist

class TestToDoListApp(unittest.TestCase):

    def test_if_option_menu_works(self):
        todolist.menu("TO DO LIST")


    def test_to_check_adding_a_task(self):
        my_task = ["Software Engineer", "Finish Homework"]
        result = todolist.add_a_task(my_task)
        expected = 'Task added'
        self.assertEqual(result, expected)

    def test_to_check_all_task_success(self):
        my_task = ["Groceries"]
        result = todolist.view_all_tasks(my_task)
        expected = 'Groceries'
        self.assertEqual(result, expected)


    def test_to_check_mark_task_completed(self):
        my_task = ["Finish Homework"]
        result = todolist.view_all_tasks(my_task)
        expected = 'Finish Homework'
        self.assertEqual(result, expected)
