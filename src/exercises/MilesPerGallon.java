package exercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven?");
        double miles = input.nextDouble();

        Scanner inputGas = new Scanner(System.in);
        System.out.println("How much gas did you use?");
        double gas = inputGas.nextDouble();

        double milesPerGallon = miles/gas;
        System.out.println("Your Miles/Gallon are: " +milesPerGallon);

    }
}
