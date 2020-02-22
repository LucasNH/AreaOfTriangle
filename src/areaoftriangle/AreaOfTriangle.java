/*
 * Author: Lucas Noritomi-Hartwig
 * Date created: February 18, 2020
 * Date last edited: February 19, 2020
 * Program title: AreaOfTriangle.java
 * This program calculates the area of a scalene triangle
 * using either Heron's formula or using trigonometry.
 */
package areaoftriangle;

import static java.lang.Math.sin;
import java.util.Scanner;

public class AreaOfTriangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Select a method: 1 = Heron's formula, 2 = trigonometry "); // Prompting user for method
        Scanner input = new Scanner(System.in);
        int method = input.nextInt();
        switch (method) {
            case 1: // In the case that the user chooses Heron's formula
                System.out.println("Please input side length a, side lengh b, and side length c: "); // Prompting user for inputs
                Scanner case1 = new Scanner(System.in);
                double sideAc1 = case1.nextInt(); // inputting side length a for case 1
                double sideBc1 = case1.nextInt(); // inputting side length b for case 1
                double sideC = case1.nextInt(); // inputting side length c
                double semiperimeter = (sideAc1 + sideBc1 + sideC) / 2; // Calculating semi-perimeter using: s = (a+b+c)/2
                double areaC1 = Math.sqrt(semiperimeter * (semiperimeter - sideAc1) // Calculating area using Heron's formula: a = [s(s-a)(s-b)(s-c)]^(1/2)
                        * (semiperimeter - sideBc1) * (semiperimeter - sideC));
                System.out.println("The area of the triangle is " + areaC1 + " units squared."); // Outputting area
                break;
            case 2: // In the case that the user chooses trigonometry
                System.out.println("Please input side length a, side lengh b, and angle C in radians: "); // Prompting user for inputs
                Scanner case2 = new Scanner(System.in);
                double sideAc2 = case2.nextInt(); // inputting side length a for case 2
                double sideBc2 = case2.nextInt(); // inputting side length b for case 2
                double angleC = case2.nextInt(); // inputting angle C
                double areaC2 = (sideAc2 * sideBc2 * sin(angleC)) / 2; // Calculating area using trigonometry: a = [a*b*sin(C)]/2
                System.out.println("The area of the triangle is " + areaC2 + " units squared."); // Outputting area
                break;
            default:
                System.out.println("Please enter a valid input."); // Catching non-existant method
                break;
        }
    }

}
