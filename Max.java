public class Max {
    public static void main(String[] args) {
        int max = -2147483648;
        int[] numbers = { 100, -300, 200, 5000, -200000 };
        for (int i : numbers) {
            if (i > max) {
                max = i;
            }
        }
        System.out.println("Max value: " + max);
    }
}

// The reason we setup int max = -2147483648 is because it is the smallest
// possible value for an int in Java. Making sure every other number in the
// array is larger than it.

// To look for the minimum, the int max would be 2147483638