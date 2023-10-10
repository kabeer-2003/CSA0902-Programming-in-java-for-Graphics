import java.util.Scanner;

public class M_N_K {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter M: ");
        int M = scanner.nextInt();

        System.out.print("Enter N: ");
        int N = scanner.nextInt();

        System.out.print("Enter K: ");
        int K = scanner.nextInt();

        if (K <= 0) {
            System.out.println("K should be greater than 0.");
            return;
        }

        if (M > N) {
            System.out.println("M should be less than or equal to N.");
            return;
        }

        System.out.print("Result: ");
        for (int i = M; i <= N; i += K) {
            System.out.print(i + ", ");
        }

        scanner.close();
    }
}