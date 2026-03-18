package TutorialA.TutorialB;

public class Bools {
    public static void main(String[] args) {
        boolean[] bools = { true, false, true, true, true,
                true, true, true, true, false, true, true,
                true, true, true, false, true, true, true,
                true, false, false, true, true, true, true,
                true, true, false, false, false, false, true,
                true, false, true, false, true, true, false,
                true, false, true, true, true, true, false,
                false, false, true, false, true, false, false,
                true, false, true, false, true, false, false,
                false, false, false, false, false, true, false,
                true, true, true, true, false, true, false, false,
                false, false, false, false, false, true, true,
                false, false, false, true, false, true, false,
                true, false, false, true, false, false, false,
                true, true, true, false, false, true, false,
                true, true, false, false, true, true, true, false,
                false, true, true, true, true, true, false, false,
                false, false, false, true, true, true, true, true,
                false, false, false, true, false, true, true, false,
                true, true, false, false, true, false, true, true,
                false, true, true, true, true, false, false, false,
                true, false, false, true, true, false, false, false,
                true, false, false, false, false, false, true, true,
                false, false, false, true, true, false, false, true,
                false, true, true, true, false, false, false, false,
                true, false, false, true, false, false, true, true,
                true, false, false, true, true, true, true, false };

        int trueCount = 0;
        int falseCount = 0;

        for (boolean bool : bools) {
            if (bool) {
                trueCount++;
            } else {
                falseCount++;
            }
        }

        System.out.println("Number of true values: " + trueCount);
        System.out.println("Number of false values: " + falseCount);
    }
}