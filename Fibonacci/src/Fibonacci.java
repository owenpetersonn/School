/* This is my attempt at the Fibonacci project using an array to store previously calculated values, in order to be efficient
and able to deal with large numbers. This is not the one I will turn in, as our professor hasn't taught us this, and I'm assuming he just wants us to use
regular recursion.
 */
import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter nth number: ");
        int n = in.nextInt();

        long[] fibonacciCache = new long[n+1];

        long fibN = fibonacciNum(n,fibonacciCache);
        System.out.println("Fibonacci number: " + fibN);
    }

    public static long fibonacciNum(int n, long[] fibonacciCache) {
        long nthFibNum = 0;
        if (n==1 || n==2) {
            return 1;
        }
        if (fibonacciCache[n]!=0) {
            return fibonacciCache[n];
        }

        nthFibNum =  fibonacciNum(n-1, fibonacciCache) + fibonacciNum(n-2, fibonacciCache);
        fibonacciCache[n] = nthFibNum;

        return nthFibNum;
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
