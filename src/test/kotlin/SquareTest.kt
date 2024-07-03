package org.example

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

internal class SquareTest {

    @Test
    fun testGetArea() {
        val square = Square(Point(0.0, 2.0), 3.0)
        assertEquals(9.0, square.getArea())
    }

    @Test
    fun testGetTopLeft() {
        val topLeft = Point(0.0, 2.0)
        val square = Square(topLeft, 3.0)
        val returnedTopLeft = square.getTopLeft()

        // Ensure it's a new instance
        assertNotSame(topLeft, returnedTopLeft)
        assertEquals(topLeft.getXCoordinate(), returnedTopLeft.getXCoordinate())
        assertEquals(topLeft.getYCoordinate(), returnedTopLeft.getYCoordinate())
    }

    @Test
    fun testGetWidth() {
        val square = Square(Point(0.0, 2.0), 3.0)
        assertEquals(3.0, square.getWidth())
    }

    @Test
    fun testZeroWidth() {
        assertThrows<IllegalArgumentException> { Square(Point(0.0, 2.0), 0.0) }
    }

    @Test
    fun testInvalidWidthNaN() {
        assertThrows<IllegalArgumentException> { Square(Point(0.0, 2.0), Double.NaN) }
    }
}