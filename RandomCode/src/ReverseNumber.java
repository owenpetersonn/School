import java.util.Scanner;

public class ReverseNumber {

    public static int reverse(int number) {
        int reversedNumber = 0;
        int digit = 0;

        while (number != 0) {
            digit = number % 10;
            number = number / 10;
            reversedNumber = reversedNumber * 10 + digit;
        }

        return reversedNumber;
    }

    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = in.nextInt();
        System.out.println("The number reversed is: " + reverse(n));

    }

}
