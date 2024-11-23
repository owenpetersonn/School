import java.util.Scanner;

public class FibonacciProject {

    public static int fibonacciNumber(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        n = fibonacciNumber(n-1) + fibonacciNumber(n-2);

        return n;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter nth number: ");
        int n = in.nextInt();
        System.out.println(n + "th Fibonacci number: " + fibonacciNumber(n));
    }
}
/* Console Output

Enter nth number: 1
Fibonacci number: 1

Enter nth number: 3
Fibonacci number: 2

Enter nth number: 5
Fibonacci number: 5

Enter nth number: 7
Fibonacci number: 13

Enter nth number: 9
Fibonacci number: 34

 */
