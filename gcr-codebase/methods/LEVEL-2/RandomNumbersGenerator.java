import java.util.Arrays;

public class RandomNumbersGenerator {

    // Method to generate an array of 4-digit random numbers
    public int[] generate4DigitRandomArray(int size) {

        int[] numbers = new int[size];


        for (int i = 0; i < size; i++) {

            // Generate random number between 1000 and 9999
            numbers[i] = 1000 + (int)(Math.random() * 9000);

        }

        return numbers;
    }



    // Method to find average, minimum, and maximum of an array
    public double[] findAverageMinMax(int[] numbers) {

        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;

        for (int num : numbers) {

            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);

        }


        double average = (double) sum / numbers.length;


        // Return an array containing average, min, max
        return new double[] {average, min, max};

    }





    public static void main(String[] args) {

        RandomNumbersGenerator randomNum = new RandomNumbersGenerator();

        // Generate 5 random 4-digit numbers
        int[] randomNumbers = randomNum.generate4DigitRandomArray(5);


        // Display the generated numbers
        System.out.println("\nGenerated 4-digit numbers: " + Arrays.toString(randomNumbers));


        // Find average, min, and max
        double[] results = randomNum.findAverageMinMax(randomNumbers);



        System.out.println("\nResults of Random Number Generation:");
        System.out.printf("Average: %.2f\n", results[0]);
        System.out.println("Minimum: " + (int)results[1]);
        System.out.println("Maximum: " + (int)results[2]);


    }
}
