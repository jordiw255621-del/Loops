public class AssignArrayElements {
    public static void main(String[] args) {
        System.out.println();
        int[] integers = new int[3];
        String[] names = new String[3];

        integers[0] = 123;
        integers[1] = 456;
        integers[2] = 789;
        names[0] = "John";
        names[1] = "Jane";
        names[2] = "Jim";

        System.out.println("integers[0]: " + integers[0]);
        System.out.println("integers[1]: " + integers[1]);
        System.out.println("integers[2]: " + integers[2]);
        System.out.println("names[0]: " + names[0]);
        System.out.println("names[1]: " + names[1]);
        System.out.println("names[2]: " + names[2]);
        System.out.println();
    }
}

// In this code I utilised int[] arrays to store integer values and String[]
// arrays to store string values. I assigned values to each element of the
// arrays using their respective indices. Finally, I printed out the values of
// each element in the arrays to verify that they were assigned correctly.