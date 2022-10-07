import java.util.Scanner;

public class First20Primes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input an integer: ");
        int numbers = scanner.nextInt();

        int count = 0, n = 2;
        while (count < numbers) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    n++;
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(n + " ");
                n++;
                count++;
            }
        }
    }
}

