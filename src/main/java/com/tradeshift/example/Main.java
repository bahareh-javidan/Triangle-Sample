package com.tradeshift.example;

import com.tradeshift.example.triangle.Triangle;
import com.tradeshift.example.triangle.TriangleFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        double side1 = getTriangleSideLength(1);
        double side2 = getTriangleSideLength(2);
        double side3 = getTriangleSideLength(3);

        Triangle myTriangle = TriangleFactory.createTriangle(side1, side2, side3);

        System.out.println("\n****************************************************************");
        System.out.println("Your triangle type is: " + myTriangle.getTriangleType().getName());
        System.out.println("****************************************************************\n");
    }

    /**
     * This method gets a number from console input and validates it to be a long parameter.
     *
     * @param sideNumber it shows which triangle side user should enter
     * @return the value of side length
     */
    private static double getTriangleSideLength(int sideNumber) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double sideLength = 0;
        while (sideLength <= 0) {
            System.out.println("Please enter the length of side " + sideNumber + " of triangle in centimeter (e.g. 20): ");
            try {
                sideLength = Double.parseDouble(br.readLine());
                if (sideLength <= 0) {
                    System.out.println("Invalid Number!\n");
                }
            } catch (IOException | NumberFormatException e) {
                System.out.println("Invalid Number!\n");
            }

        }
        return sideLength;
    }
}
