package com.tradeshift.example.triangle;

/**
 * It is an interface of all triangles.
 * All triangles should implements this interface to show that they are triangles.
 *
 * @author E. Javidan
 * @since 5/4/17.
 */
public interface Triangle {

    /**
     * By using this method, all classes that implements this interface could return their triangle type.
     *
     * @return triangle type
     */
    TriangleType getTriangleType();
}
