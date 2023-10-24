import java.util.Scanner;

public class Fibconverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the position of the Fibonacci number you want to find:");
        int n = scanner.nextInt();

        int result = fibonacci(n);
        System.out.println("The Fibonacci number at position " + n + " is: " + result);
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}