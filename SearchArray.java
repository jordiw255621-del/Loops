public class SearchArray {
    public static void main(String[] args) {
        int[] numbers = { 22, 55, 11, 73, 22, 33, 44, 55 };
        int index = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 50) {
                index = i;
                break;
            }
        }
        if (index >= 0) {
            System.out.println("Index of 50+ is " + index + " value " + numbers[index]);
        } else {
            System.out.println("50+ is not in the array");
        }
    }
}