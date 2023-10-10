import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Statistics {
    public static void main(String[] args) {
        double[] array = {16, 18, 27, 16, 23, 21, 19};

        double mean = calculateMean(array);
        double median = calculateMedian(array);
        double mode = calculateMode(array);

        System.out.println("Mean = " + mean);
        System.out.println("Median = " + median);
        System.out.println("Mode = " + mode);
    }

    public static double calculateMean(double[] array) {
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    public static double calculateMedian(double[] array) {
        Arrays.sort(array);
        int length = array.length;
        if (length % 2 == 0) {
            // If the array has an even number of elements, average the middle two values.
            int middle1 = length / 2 - 1;
            int middle2 = length / 2;
            return (array[middle1] + array[middle2]) / 2.0;
        } else {
            // If the array has an odd number of elements, return the middle value.
            int middle = length / 2;
            return array[middle];
        }
    }

    public static double calculateMode(double[] array) {
        Map<Double, Integer> frequencyMap = new HashMap<>();
        for (double num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        double mode = 0;
        int maxFrequency = 0;

        for (Map.Entry<Double, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                maxFrequency = entry.getValue();
                mode = entry.getKey();
            }
        }

        return mode;
    }
}