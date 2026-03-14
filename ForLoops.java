public class ForLoops {
    public static void main(String[] args) {
        // A.
        System.out.println("Loop A");
        for (int i = 0; i < 6; i++) {
            System.out.println("Step: " + i);
        }

        System.out.println(); // Print empty line

        // B.
        System.out.println("Loop B");
        for (int i = 10; i >= 0; i--) {
            System.out.println("Step: " + i);
        }

        System.out.println(); // Print empty line

        // C.
        System.out.println("Loop C");
        for (int i = 7; i <= 22; i += 3) {
            System.out.println("Step: " + i);
        }

    }
}