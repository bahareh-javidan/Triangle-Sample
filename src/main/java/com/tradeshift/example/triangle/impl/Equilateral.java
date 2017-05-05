package com.tradeshift.example.triangle.impl;

import com.tradeshift.example.triangle.Triangle;
import com.tradeshift.example.triangle.TriangleType;

/**
 * It is an equilateral triangle.
 *
 * @author E. Javidan
 * @since 5/4/17.
 */
public class Equilateral implements Triangle {

    /**
     * It defines the type of this triangle
     *
     * @return triangle type
     */
    @Override
    public TriangleType getTriangleType() {
        return TriangleType.EQUILATERAL;
    }
}
