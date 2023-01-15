package Question04;

import java.util.Scanner;

public class Swap {

    //Write a Java Program to swap two numbers
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 2 numbers to swap");
        double n1 = scan.nextDouble();
        double n2 = scan.nextDouble();

        System.out.println("Before swapping: " + n1 + " - " + n2);
    }
}
