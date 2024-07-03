package org.example

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

internal class RectangleTest {

    @Test
    fun testGetArea() {
        val rectangle = Rectangle(Point(0.0, 2.0), Point(3.0, 0.0))
        assertEquals(6.0, rectangle.getArea())
    }

    @Test
    fun testGetTopLeft() {
        val topLeft = Point(0.0, 2.0)
        val rectangle = Rectangle(topLeft, Point(3.0, 0.0))
        val returnedTopLeft = rectangle.getTopLeft()

        // Ensure it's a new instance
        assertNotSame(topLeft, returnedTopLeft)
        assertEquals(topLeft.getXCoordinate(), returnedTopLeft.getXCoordinate())
        assertEquals(topLeft.getYCoordinate(), returnedTopLeft.getYCoordinate())
    }

    @Test
    fun testGetBottomRight() {
        val bottomRight = Point(3.0, 0.0)
        val rectangle = Rectangle(Point(0.0, 2.0), bottomRight)
        val returnedBottomRight = rectangle.getBottomRight()

        // Ensure it's a new instance
        assertNotSame(bottomRight, returnedBottomRight)
        assertEquals(bottomRight.getXCoordinate(), returnedBottomRight.getXCoordinate())
        assertEquals(bottomRight.getYCoordinate(), returnedBottomRight.getYCoordinate())
    }

    @Test
    fun testZeroWidth() {
        assertThrows<IllegalArgumentException> { Rectangle(Point(0.0, 2.0), Point(0.0, 0.0)) }
    }

    @Test
    fun testZeroHeight() {
        assertThrows<IllegalArgumentException> { Rectangle(Point(0.0, 2.0), Point(3.0, 2.0)) }
    }
}