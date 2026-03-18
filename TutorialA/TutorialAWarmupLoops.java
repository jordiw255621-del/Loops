package TutorialA;

public class TutorialAWarmupLoops {
    public static void main(String[] args) {
        System.out.println("\nFirst Loop");
        for (int i = 45; i < 60; i++) {
            if (i % 2 == 1)
                System.out.println(i);
        }
        System.out.println("\nSecond Loop");
        for (int i = 17; i > -1; i--) {
            if (i % 3 == 0)
                System.out.println(i);
        }
        System.out.println("Third Loop");
        String hey = new String();
        int count = 0;
        while (count < 20) {
            hey += "Hey! ";
            count++;
        }
        System.out.println(hey);
        {
        }
    }

}
