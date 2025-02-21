import java.util.Scanner;

class DuplicateEliminationChat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[10]; // Stores user input
        int count = 0; // Tracks the number of unique elements

        System.out.println("Enter ten numbers between 10 and 100:");

        for (int i = 0; i < 10; i++) {
            int inputNumber = input.nextInt();

            // Ensure number is between 10 and 100
          if (inputNumber < 10 || inputNumber > 100) {
             System.out.println("Invalid number! Must be between 10 and 100.");
                i--; // Retry this iteration
                continue;
            }

            // Check if number is already in the array
            boolean exists = false;
            for (int j = 0; j < count; j++) {
                if (numbers[j] == inputNumber) {
                    exists = true;
                    break;
                }
            }

            // If number is unique, add it to the array
            if (!exists) {
                numbers[count++] = inputNumber;
            }
        }

        input.close();

        // Print the unique numbers in array format
        System.out.print("Unique Numbers Are: [");
        for (int i = 0; i < count; i++) {
            System.out.print(numbers[i]);
            if (i < count - 1) { // Avoid extra comma at the end
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
