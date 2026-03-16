public class RainfallVariant {
    public static void main(String[] args) {
        double[] rainfall = { 10, 15, 5, 7, 20, 12, 8, 5, 2, 10, 6, 10, 14, 9, 4, 3, 5, 18, 10, 12, 7, 5, 9, 11, 6, 13,
                15, 17, 8, 6 };
        double totalRainfall = 0.0;
        for (int i = 0; i < rainfall.length; i++) { // Writes a loop, start total at 0,
                                                    // loop each value + add it + divide
            totalRainfall = totalRainfall + rainfall[i]; // This line helps to add all the values in the
                                                         // array together (rainfall[i] as a bucket collecting data)
        }
        double averageRainfall = totalRainfall / rainfall.length;
        System.out.println("Total rainfall: " + totalRainfall);
        System.out.println("Average rainfall: " + averageRainfall);
    }
}
