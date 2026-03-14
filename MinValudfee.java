public class MinValudfee {
    public static void main(String[] args) {
        int[] numbers = { 1000000, -999999, 22, 55, 11, 73, 22, 33, 44, 55 };
        int minValue = 100000;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < minValue) {
                minValue = numbers[i];
            }
        }
        System.out.println("minValue == " + minValue);
    }
}