package exercises;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args ){

     Scanner input = new Scanner(System.in);
     System.out.println("Enter the Rectangular length:");
     int length = input.nextInt();

        Scanner inputWidth = new Scanner(System.in);
        System.out.println("Enter the Rectangular width:");
        int width = inputWidth.nextInt();

        int rectangularArea = length*width;
        System.out.println("The area of the rectangle is " + rectangularArea);

    }
}
