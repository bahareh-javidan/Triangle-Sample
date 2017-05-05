package com.tradeshift.example.triangle;

/**
 * This enum contains all triangle that this program supports.
 * To support another triangle you should add the enum to this class and implement its type too. Be sure to implement
 * its determination in factory class as well.
 *
 * @author E. Javidan
 * @since 5/4/17.
 */
public enum TriangleType {
    EQUILATERAL("Equilateral"),
    ISOSCELES("Isosceles"),
    SCALENE("Scalene");

    private final String name;

    TriangleType(String name) {
        this.name = name;
    }

    /**
     * This method returns the name of triangle.
     *
     * @return name of triangle
     */
    public String getName() {
        return name;
    }
}
