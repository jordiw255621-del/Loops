public class MinValue {
    public static void main(String[] args) {
        int[] numbers = { -32423, 22, 55, 11, 73, 22, 33, 44, 55 };
        int minValue = 2147483647;
        for (int i : numbers) {
            if (i < minValue) {
                minValue = i;
            }
        }
        System.out.println("Min value: " + minValue);
    }

}
