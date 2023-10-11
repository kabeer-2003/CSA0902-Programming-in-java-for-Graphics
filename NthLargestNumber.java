import java.util.Arrays;

public class NthLargestNumber {
    public static void main(String[] args) {
        int[] arr = {14, 67, 48, 23, 5, 62};
        int n = 4; // Change this to the desired value of N

        if (n <= 0 || n > arr.length) {
            System.out.println("Invalid value of N.");
        } else {
            int nthLargest = findNthLargest(arr, n);
            System.out.println(n + "th Largest number: " + nthLargest);
        }
    }

    public static int findNthLargest(int[] arr, int n) {
        Arrays.sort(arr);
        return arr[arr.length - n];
    }
}
