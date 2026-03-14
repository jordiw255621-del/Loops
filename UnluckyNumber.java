public class UnluckyNumber {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 3 || i == 4) {
                System.out.println("UNLUCKY Number: " + i);
                continue;
            }
            System.out.println("Number: " + i);
        }
    }
}

// In this code, I used a continue statement to skip the numbers 3 and 4, which
// are considered "unlucky". When the loop encounters these numbers, it prints a
// message indicating that they are unlucky and then continues to the next
// iteration of the loop, skipping the normal print statement for those numbers.