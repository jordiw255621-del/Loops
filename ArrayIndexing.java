public class ArrayIndexing {
    public static void main(String[] args) {
        System.out.println();
        int[] numbers = { 400, 80000, 1500, 500 };

        int value0 = numbers[0];
        int value1 = numbers[1];
        int value2 = numbers[2];
        System.out.println("value0: " + value0);
        System.out.println("value1: " + value1);
        System.out.println("value2: " + value2);
        int length = numbers.length;
        int lastValue = numbers[length - 1];
        System.out.println("lastValue: " + lastValue);
        System.out.println();
    }
}