package TutorialA;

public class SumOddNumbers {
    public static void main(String[] args) {
        System.out.println("Enter a positive number: ");
        int number = In.nextInt(); // (Using In.nextInt to ask for input)
        if (number > 0) { // Checks if the number is over 0 (Positive)
            int sum = 0; // This line opens a bucket
            for (int i = 1; i <= number; i++) { // This line creates a loop from 1 to the number the user has entered
                if (i % 2 == 1) { // This line checks if the number is odd
                    sum += i; // This line adds the odd number to the sum
                }
            }
            System.out.println("Sum of odd numbers from 1 to " + number + " is " + sum);
        } else {
            System.out.println("Please enter a positive number.");

        }
    }
}
