package org.example

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import kotlin.math.PI

internal class CircleTest {

    @Test
    fun testGetArea() {
        val circle = Circle(Point(0.0, 0.0), 2.0)
        assertEquals(PI * 2.0 * 2.0, circle.getArea())
    }

    @Test
    fun testGetCenterPoint() {
        val center = Point(1.0, 2.0)
        val circle = Circle(center, 5.0)
        val returnedCenter = circle.getCenterPoint()

        // Ensure it's a new instance
        assertNotSame(center, returnedCenter)
        assertEquals(center.getXCoordinate(), returnedCenter.getXCoordinate())
        assertEquals(center.getYCoordinate(), returnedCenter.getYCoordinate())
    }

    @Test
    fun testGetRadiusX() {
        val circle = Circle(Point(0.0, 0.0), 3.0)
        assertEquals(3.0, circle.getRadiusX())
    }

    @Test
    fun testZeroRadius() {
        assertThrows<IllegalArgumentException> { Circle(Point(0.0, 0.0), 0.0) }
    }

    @Test
    fun testInvalidRadiusNaN() {
        assertThrows<IllegalArgumentException> { Circle(Point(0.0, 0.0), Double.NaN) }
    }
}