import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        int number = getInput("Enter a number: ");
        boolean isPrime = isPrime(number);
        System.out.println(number + " is " + (isPrime ? "a prime number." : "not a prime number."));
    }

    private static int getInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextInt();
    }

    private static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
