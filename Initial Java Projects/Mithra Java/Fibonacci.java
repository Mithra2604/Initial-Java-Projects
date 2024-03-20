public class Fibonacci {
    // Recursive method to calculate nth Fibonacci number
    public static int fibonacci(int n) {
        // Base cases
        if (n <= 1) {
            return n;
        }
        // Recursive call to calculate nth Fibonacci number
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 10; // Change n to calculate different Fibonacci numbers
        int fib = fibonacci(n);
        System.out.println("The " + n + "th Fibonacci number is: " + fib);
    }
}

