public class SumOfOdd {
    public static void main(String[] args) {
        {
            int sum = 0;
            for (int i = 0; i <= 50; i++) {
                if (i % 2 == 1) { // Check if the number is odd
                    sum += i; // Add the odd number to the sum
                }
            }
            System.out.println("Sum of odd numbers from 0 to 50 = " + sum);
        }
    }
}

// To check if a number is even we use % 2 == 0 because even numbers are
// divisible by 2 without leaving a remainder.
// For odd numbers, we check if the number is not divisible by 2,
// which can be done using % 2 == 1