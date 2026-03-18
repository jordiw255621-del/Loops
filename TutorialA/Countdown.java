package TutorialA;

public class Countdown {
    public static void main(String[] args) {
        System.out.println("Enter a positive number");
        int n = In.nextInt();
        System.out.println("Your number is: " + n);
        if (n % 2 == 0) {
            System.out.println("Your number is even");
        } else {
            System.out.println("Your number is odd");
        }
        for (int i = n; i > 0; i--) {
            if (i % 2 == 0) {
                System.out.println(i + " is EVEN");
            } else {
                System.out.println(i + " is ODD");
            }
        }

    }
}
