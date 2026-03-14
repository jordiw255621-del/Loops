public class SearchingArray {
    public static void main(String[] args) {
        int[] numbers = { 22, 23, 81, 23, 49, 73, 33, 23 };
        int index = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 73) {
                index = i;
                break;
            }
        }
        if (index >= 0) {
            System.out.println("Index of 73 is " + index);
        } else {
            System.out.println("73 is not in the array");
        }
    }
}

// In this java code, I searched for the value 73 in the numbers array using a
// for loop. If the value is found, I printed out the index of the value. If the
// value is not found, I printed out a message indicating that the value is not
// in the array.

// The reason the output is 5 is because the index of 73 in the array is 5