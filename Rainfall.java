class Rainfall {
    public static void main(String[] args) {
        double[] rainfall = {
                10, 15, 5, 7, 20, 12, 8, 5, 2, 10, 6, 10, 14, 9,
                4, 3, 5, 18, 10, 12, 7, 5, 9, 11, 6, 13, 15, 17, 8, 6
        };

        double totalRainfall = 0.0; // The sum of all rainfall added up
        double averageRainfall = 0.0; // Is the amount of values there are in the array

        for (double month : rainfall) {
            totalRainfall += month; // This line helps to add all the values in the array together
        }
        averageRainfall = totalRainfall / rainfall.length;
        System.out.println("Total rainfall: " + totalRainfall);
        System.out.println("Average rainfall: " + averageRainfall);

    }
}
