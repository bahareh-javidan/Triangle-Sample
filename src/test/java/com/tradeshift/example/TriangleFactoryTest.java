package com.tradeshift.example;

import com.tradeshift.example.triangle.TriangleFactory;
import com.tradeshift.example.triangle.TriangleType;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Enssieh Javidan
 * @since 5/4/2017
 */
public class TriangleFactoryTest {

    /**
     * This test method checks whether the input parameters > 0 and throws a RuntimeException if not .
     */
    @Test(expected = RuntimeException.class)
    public void createTriangleTest() {
        double p1 = 1;
        double p2 = 0;
        double p3 = 1;
        TriangleFactory.createTriangle(p1, p2, p3);
    }

    /**
     * This test method checks whether this is an EQUILATERAL triangle
     */
    @Test
    public void equilateralTriangleTest() {
        double p1 = 10;
        double p2 = 10;
        double p3 = 10;
        Assert.assertTrue(TriangleFactory.createTriangle(p1, p2, p3).getTriangleType().equals(TriangleType.EQUILATERAL));
    }

    /**
     * This test method checks whether this is an ISOSCELES triangle.
     */
    @Test
    public void isoscelesTriangleTest() {
        double p1 = 5;
        double p2 = 10;
        double p3 = 10;
        Assert.assertTrue(TriangleFactory.createTriangle(p1, p2, p3).getTriangleType().equals(TriangleType.ISOSCELES));
    }

    /**
     * This test method checks whether this is a SCALENE triangle
     */
    @Test
    public void scaleneTriangleTest() {
        double p1 = 5;
        double p2 = 7;
        double p3 = 15;
        Assert.assertTrue(TriangleFactory.createTriangle(p1, p2, p3).getTriangleType().equals(TriangleType.SCALENE));
    }
}
