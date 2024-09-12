import java.util.Scanner;

public class TemperatureAnalysis {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        //Step 1: User input for number of temperatures
        System.out.print("Enter the number of temperature values: ");
        int n = scanner.nextInt(); // Number of temp readings

        //Step 2: Declare an array to store the temp values
        double[] temperatures = new double[n];

        //Step 3: User to enter all temp values
        for (int i = 0; i < n; i++) {
            System.out.print("Enter temperature: " + (i + 1) + ": ");
            temperatures[i] = scanner.nextDouble(); //store input
        }

        //Step 4: Calculate avg temp
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += temperatures[i];
        }
        double averageTemp = sum / n; // Calculate average
        System.out.printf("Average Temperature: %.2f%n", averageTemp);

        //Step 5: How many temps are above average
        int aboveAverageCount = 0;
        for (int i = 0; i < n; i++) {
            if (temperatures[i] > averageTemp) {
                aboveAverageCount++;
            }
   
        }

        //Step 6: Output
        System.out.println("Number of days with temperature above average: " + aboveAverageCount);

        scanner.close();
    }

}