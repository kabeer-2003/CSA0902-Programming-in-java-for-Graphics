import java.util.ArrayList;

public class PerfectNumbers {
    public static void main(String[] args) {
        int n = 3; 
        if (n <= 0) {
            System.out.println("N must be a positive integer.");
        } else {
            System.out.print("First " + n + " perfect numbers are: ");
            int count = 0;
            long number = 2;

            while (count < n) {
                if (isPerfectNumber(number)) {
                    System.out.print(number);
                    count++;
                    if (count < n) {
                        System.out.print(" , ");
                    }
                }
                number++;
            }

            System.out.println();
        }
    }

    public static boolean isPerfectNumber(long number) {
        long sum = 1;
        for (long i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                sum += i;
                if (i != (number / i)) {
                    sum += (number / i);
                }
            }
        }
        return sum == number;
    }
}
