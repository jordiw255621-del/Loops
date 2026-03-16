public class TestScores {
    public static void main(String[] args) {
        double[] scores = { 30, 88, 48, 72, 99, 15, 10 };

        double totalScore = 0.0;
        double averageScore = 0.0;
        double highestScore = Double.MIN_VALUE;
        double lowestScore = 0.0;

        for (double score : scores) {
            totalScore += score;
        }

        averageScore = totalScore / scores.length;
        highestScore = scores[0];
        lowestScore = scores[0];

        for (double score : scores) {
            if (score > highestScore) {
                highestScore = score;
            }
            if (score < lowestScore) {
                lowestScore = score;
            }

        }

        System.out.println("Number of Scores: " + scores.length);
        System.out.println("Average of Scores: " + averageScore);
        System.out.println("Total Score: " + totalScore);
        System.out.println("Highest Score: " + highestScore);
        System.out.println("Lowest Score: " + lowestScore);

    }

}
