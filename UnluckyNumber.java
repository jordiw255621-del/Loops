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