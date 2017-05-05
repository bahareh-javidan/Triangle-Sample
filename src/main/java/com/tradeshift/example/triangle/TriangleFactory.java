package com.tradeshift.example.triangle;

import com.tradeshift.example.triangle.impl.Equilateral;
import com.tradeshift.example.triangle.impl.Isosceles;
import com.tradeshift.example.triangle.impl.Scalene;

/**
 * This is a factory class to build a triangle object. All the business to define the triangle type should be in this
 * class.
 *
 * @author E. Javidan
 * @since 5/4/17.
 */
public class TriangleFactory {

    /**
     * This method gets triangle side length and builds the required triangle.
     *
     * @param a side 1 of the triangle length
     * @param b side 2 of the triangle length
     * @param c side 3 of the triangle length
     * @return the triangle object
     */
    public static Triangle createTriangle(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new RuntimeException("Wrong input parameter: 0 or less zero is not valid input.");
        }
        if (a == b && b == c) {
            return new Equilateral();
        } else if (a == b || b == c || a == c) {
            return new Isosceles();
        } else {
            return new Scalene();
        }
    }
}
