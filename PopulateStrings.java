public class PopulateStrings {
    public static void main(String[] args) {
        String[] steps = new String[6];
        for (int i = 0; i < steps.length; i++) {
            steps[i] = "Step: " + i;
        }
        for (String step : steps) {
            System.out.println(step);
        }
    }
}
