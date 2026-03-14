public class WhileLoops {
    public static void main(String[] args) {
        // A.
        System.out.println("Loop A");
        int i = 0;
        while (i < 6) {
            System.out.println("Step: " + i);
            i++;
        }

        System.out.println(); // Print empty line

        // B.
        System.out.println("Loop B");

        // NOTE: Java won't let you declare `i` again, so we simply
        // re-assign the value of `i` to 10. (Try to declare it and
        // look at the error message for yourself!)
        i = 10;
        while (i >= 0) {
            System.out.println("Step: " + i);
            i--;
        }

        System.out.println(); // Print empty line

        // C.
        System.out.println("Loop C");
        i = 7;
        while (i <= 22) {
            System.out.println("Step: " + i);
            i += 3;
        }

    }
}
