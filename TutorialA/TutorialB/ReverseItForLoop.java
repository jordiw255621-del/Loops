package TutorialA.TutorialB;

public class ReverseItForLoop {
    public static void main(String[] args) {
        int sumOdd = 0;
        int sumEven = 0;
        for (int i = 20; i > 0; i--) {
            System.out.println(i);
        }
        for (int i = 20; i > 0; i--) {
            if (i % 2 == 0) {
                sumEven += i;
            } else {
                sumOdd += i;
            }
        }
        System.out.println("Sum of even numbers: " + sumEven);
        System.out.println("Sum of odd numbers: " + sumOdd);

    }
}

// Write a for loop that displays the numbers in reverse order from 20 to 1
// inclusive (using the loop counter).
// Now create 2 variables, one for the sum of all even numbers and the other for
// the sum of all odd numbers. Integrate these variables into the for loop to
// compute the correct totals.
// Print the 2 totals.