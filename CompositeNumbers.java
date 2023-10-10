import java.util.Scanner;

public class CompositeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter A: ");
        int A = scanner.nextInt();

        System.out.print("Enter B: ");
        int B = scanner.nextInt();

        if (A > B) {
            System.out.println("A should be less than or equal to B.");
            return;
        }

        System.out.print("Composite Numbers: ");
        for (int i = A; i <= B; i++) {
            if (isComposite(i)) {
                System.out.print(i + ", ");
            }
        }

        scanner.close();
    }

    // Function to check if a number is composite
    public static boolean isComposite(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return true;
            }
        }
        return false;
    }
}