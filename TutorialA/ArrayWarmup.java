package TutorialA;

public class ArrayWarmup {
    public static void main(String[] args) {
        double[] arr1 = { 10, 20, 30, 40, 50, 60 };
        double[] arr2 = { 45, -12, 37, 98 };

        double totalArr1 = 0.0;
        double totalArr2 = 0.0;
        double averageArr1 = 0.0;
        double averageArr2 = 0.0;

        for (double arr : arr1) {
            totalArr1 += arr;
        }
        for (double arrr : arr2) {
            totalArr2 += arrr;
        }
        averageArr2 = totalArr2 / arr2.length;
        {
        }
        {
            averageArr1 = totalArr1 / arr1.length;
        }

        System.out.println("Sum of arr1: " + totalArr1);
        System.out.println("Sum of arr2: " + totalArr2);
        System.out.println("Average of arr1: " + averageArr1);
        System.out.println("Average of arr2: " + averageArr2);

        int[] numbers = new int[11]; // To go
        for (int i = 10; i < numbers.length; i--) {
            numbers[i] = i;
            System.out.println("Numbers: " + numbers[i]);
        }
    }
}
