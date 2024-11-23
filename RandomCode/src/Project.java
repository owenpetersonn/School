import java.util.Scanner;

public class Project {

    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Addition (+), subtraction (-), multiplication (x), or division (/) ?: ");
        String input = in.next();

        while (input.equals("+") || input.equals("-") || input.equals("x") || input.equals("/")) {
            System.out.println("Enter first number: ");
            int firstNumber = in.nextInt();
            System.out.println("Enter second number: ");
            int secondNumber = in.nextInt();

            if (input.equals("+")) {
                int sum = firstNumber + secondNumber;
                System.out.println("The sum is: " + sum);

            }
            else if (input.equals("-")) {
                int sum = firstNumber - secondNumber;
                System.out.println("The difference is: " + sum);

            }
            else if (input.equals("x")) {
                int sum = firstNumber * secondNumber;
                System.out.println("The product is: " + sum);
            }
            else {
                int sum = firstNumber / secondNumber;
                System.out.println("The remainder is: " + sum);
            }

            System.out.println("Addition (+), subtraction (-), multiplication (x), or division (-)  ?: ");
            input = in.next();


        }




    }
}
