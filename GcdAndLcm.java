import java.util.Scanner;

public class GcdAndLcm {
    public static void main(String[] args) {
        int num1 = getInput("Enter first number: ");
        int num2 = getInput("Enter second number: ");
        
        int gcd = calculateGCD(num1, num2);
        int lcm = calculateLCM(num1, num2, gcd);
        
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
    }

    private static int getInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextInt();
    }

    private static int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    private static int calculateLCM(int a, int b, int gcd) {
        return (a * b) / gcd;
    }
}
