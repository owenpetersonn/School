import java.util.Scanner;

/** This program calculates the area of 3 rectangles and 2 squares. The program
 *	prompts the user to input the length and width for each shape, and then
 *	creates objects for these shapes and adds the objects to a list. It then iterates through
 *  the list and prints out the area for each shape.
 *
 *	@author Robert Owen Peterson
 *	@version 11/23/2024
 */

public class Main {

    public static void main(String[] args) {
        // Initializing array of object type Rectangle, with a size of 5
        Rectangle[] objects = new Rectangle[5];

        Scanner in = new Scanner(System.in);

        // A loop to gather from the user the length and width of 3 rectangles, then creates a rectangle object with those attributes
        // and adds the object to the list of Rectangle objects initialized above
        for (int i = 0; i < objects.length-2; i++) {
            System.out.println("Enter the length for rectangle number " + (i + 1) + ": ");
            int length = in.nextInt();
            System.out.println("Enter the width for rectangle number " + (i + 1) + ": ");
            int width = in.nextInt();
            objects[i] = new Rectangle(length, width);
        }

        // A loop to gather from the user the side length of 2 squares, then creates a square object with those attributes
        // and adds the object to the list of Rectangle objects initialized above
        for (int i = objects.length-2; i < objects.length; i++) {
            System.out.println("Enter the side length for square number " + (i-2) + ": ");
            int length = in.nextInt();
            objects[i] = new Square(length);

        }

        // A loop that iterates through the list of Rectangle objects and prints their area and perimeter
        // using the .getArea and .getPerimeter methods in the Rectangle class
        for (Rectangle object : objects) {
            System.out.println(object + " | Area: " + object.getArea() + " | Perimeter: " + object.getPerimeter());
        }





    }
}
